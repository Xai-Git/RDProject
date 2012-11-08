package rdproject.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import rdproject.dao.RdUserDao;
import rdproject.model.User;

/**
 * 
 * @author Samuel Aquino
 *
 */
@Repository
public class RdUserDaoImpl implements RdUserDao
{
    private EntityManager entityManager;
    
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager)
    {
    	this.entityManager = entityManager;
    }
    
    /**
     * Retrieve user by user name.
     */
	@Override
	public User getUser(String username) throws DataAccessException
	{
		String hql = "select u from User u where u.username = :username";
		
		Query query = entityManager.createQuery(hql);
		query.setParameter("username", username);
		
		return (User)query.getSingleResult();
	}

	/**
	 * Saves the new created user
	 */
	@Override
	public void saveUser(User user) throws DataAccessException 
	{
		if(user.getId() == null)
		{
			entityManager.persist(user);
		}
		else
		{
			user = entityManager.merge(user);
		}
	}

}
