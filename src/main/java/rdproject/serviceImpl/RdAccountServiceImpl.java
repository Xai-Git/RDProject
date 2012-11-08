package rdproject.serviceImpl;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;

import rdproject.dao.RdUserDao;
import rdproject.form.RdCreateAccountForm;
import rdproject.model.User;
import rdproject.service.RdAccountService;

/**
 * 
 * @author Samuel Aquino
 * 
 */
@Service
public class RdAccountServiceImpl implements RdAccountService
{
	
	@Autowired
	@Qualifier("passwordEncryptor")
	private StrongPasswordEncryptor encryptor;
	
	@Autowired
	private RdUserDao userDao;

	/**
	 * Authenticates a user.
	 */
	@Override
	public User authenticate(String username, String password, Errors errors)
	{
		User user;
		
		try
		{
		    user = userDao.getUser(username);
		}
		catch(Exception exc)
		{
			user = null;
		}
		
		if(user != null)
		{
			if(!encryptor.checkPassword(password, user.getPassword()))
			{
				user = null;
				errors.reject("error.credentials", "error.credentials");
			}
		}
		else
		{
			errors.reject("error.credentials", "error.credentials");
		}
		
		return user;
	}

	@Override
	@Transactional
	public void createUserAcct(RdCreateAccountForm form, Errors errors) 
	{
		/** Make new account code*/
		if (checkUsername(form,errors))
		{
			errors.reject("errors.dupeuser", "errors.dupeuser");
		}
		if (!form.getPassword().equals(form.getRePassword()))
		{
			errors.reject("errors.repassword", "errors.repassword");
		}
		
		if(!errors.hasErrors())
		{
			User user = new User();
			user.setUsername(form.getUsername());
			user.setPassword(encryptor.encryptPassword(form.getPassword()));
		    userDao.saveUser(user);
		}
	}

	/**
	 * try to search for a result
	 * getSingleResult() in userDao.getUser()
	 * catches an exception if no result is found
	 */
	@Override
	public Boolean checkUsername(RdCreateAccountForm form, Errors errors) 
	{
		Boolean bool = false;
		
		User user;
		
		try
		{
			user = userDao.getUser(form.getUsername());
		}
		catch(Exception exc)
		{
			user = null;
		}
			
		if (user != null)
		{
			bool = true;			
		}
		else
		{
			bool = false;
		}
		return bool;
	}
}
