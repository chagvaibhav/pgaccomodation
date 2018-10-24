package com.jalaram.pgaccomodation.customvalidation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = cityValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface isValidCity {
	
	String listOfValidCities() default "Jamnagar|Rajkot|Junagadh|Ahmedabad|Surat"; 
	
	String message() default "Please provide a valid city accepted cities are Ahmedabad,Rajkot and Jamnagar (Choose any one)";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}