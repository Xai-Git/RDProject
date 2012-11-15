package rdproject.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import rdproject.model.Drug;

public class RdDrugValidator implements Validator 
{

	public boolean supports(Class<?> clazz) 
	{
		return Drug.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) 
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "drugGName", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "drugTName", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "drugFocus", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "routeAdmin", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "reasonAdmin", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "doseWPVValue", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "doseWPVUnit", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "concWValue", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "concWUnit", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "concVValue", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "concVUnit", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "fluidEVValue", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "fluidEWVUnit", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "methodAdmin", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "minSDWValue", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "minSDWUnit", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "maxSDWValue", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "maxSDWUnit", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "maxTTLDose", "error.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "maxWDisplay", "error.required");
	}
}
