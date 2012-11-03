package rdproject.service;

import org.springframework.validation.Errors;

import rdproject.model.User;

/**
 * 
 * @author Samuel Aquino
 *
 */
public interface RdSecurityService
{
    public User authenticate(String username, String password, Errors errors);
}
