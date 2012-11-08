package rdproject.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import rdproject.form.RdLoginForm;

/**
 * @author Samuel Aquino
 */
public class RdLoginValidator implements Validator 
{

	public boolean supports(Class<?> clazz)
	{
		return RdLoginForm.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) 
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "username", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "password", "error.required");
	}

}
