package rdproject.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import rdproject.model.Organization;

public class RdOrganizationValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return Organization.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgName", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgAddr1", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgCity", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgState", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgZip", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgWeb", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgPhone", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgFax", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "orgEmail", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "dirTitle", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "dirFName", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "dirMName", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "dirLName", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "dirPhone", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "dirExt", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "dirFax", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "dirEmail", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "conTitle", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "conFName", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "conLName", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "conPhone", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "conFax", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "conEmail", "error.required");
	}

}
