package rdproject.dao;

import org.springframework.dao.DataAccessException;

import rdproject.model.User;

/**
 * 
 * @author Samuel Aquino
 *
 */
public interface RdUserDao
{
    public User getUser(String username) throws DataAccessException;
}
