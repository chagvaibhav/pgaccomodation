package com.jalaram.pgaccomodation.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<isValidPhone,String>{

	public void initialize(isValidPhone arg0) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String mobile, ConstraintValidatorContext ctx) {
		if (mobile == null){
			return false;
		}

		if (mobile.matches("\\d{10}")) return true;
		else return false;
	}
}
