package rdproject.service;

import org.springframework.validation.Errors;

import rdproject.form.RdCreateAccountForm;
import rdproject.model.User;

/**
 * @author Samuel Aquino
 */
public interface RdAccountService
{
    public User authenticate(String username, String password, Errors errors);
    public void createUserAcct(RdCreateAccountForm form, Errors errors);
    public Boolean checkUsername(RdCreateAccountForm form, Errors errors);
}
