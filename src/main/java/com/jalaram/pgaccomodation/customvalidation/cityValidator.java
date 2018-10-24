package com.jalaram.pgaccomodation.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class cityValidator implements ConstraintValidator<isValidCity, String>{

	String listOfValidCities;
	
	public void initialize(isValidCity isValidCity) {
		this.listOfValidCities = isValidCity.listOfValidCities();
	}

	public boolean isValid(String city, ConstraintValidatorContext ctx) {
		
		if (city == null){
			return false;
		}
		
		if (city.matches(listOfValidCities)){
			return true;
		}else{
			return false;
		}
	}
}
