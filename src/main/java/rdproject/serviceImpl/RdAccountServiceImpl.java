package rdproject.serviceImpl;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import rdproject.dao.RdUserDao;
import rdproject.model.User;
import rdproject.service.RdSecurityService;

/**
 * 
 * @author Samuel Aquino
 * 
 */
@Service
public class RdAccountServiceImpl implements RdSecurityService
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
		User user = userDao.getUser(username);
		
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

}
