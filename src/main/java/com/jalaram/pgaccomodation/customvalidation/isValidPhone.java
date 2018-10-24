package com.jalaram.pgaccomodation.customvalidation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface isValidPhone {
	
	String message() default "Phone Number should of 10 digits";
	
	Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};
}
