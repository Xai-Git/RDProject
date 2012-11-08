package rdproject.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import rdproject.form.RdCreateAccountForm;

/**
 * @author Samuel Aquino
 */
public class RdAccountValidator implements Validator
{
	@Override
	public boolean supports(Class<?> clazz) 
	{
		return RdCreateAccountForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) 
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "username", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "password", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "rePassword", "error.required");
		
	}

}
