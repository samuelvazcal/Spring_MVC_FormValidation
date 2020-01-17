package com.springcourse.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * CourseCodeConstraintValidator- > Helper class that contains business rules/validation logic
 * @Target -> This new annotation can be applied on methods or on fields
 * @Retention -> How long will the marked annotation be stores or used. Retain this annotation in the Java class file and
 * RUNTIME is for process it at runtime
 * @author Samuel_Vazquez
 *
 */
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	/**
	 * We are gonna have two attributes, one for values and one for the actual error message
	 */
	
	//Define default course code
	public String value() default "LUV";
	//Define default error message
	public String message() default "Must start with LUV";
	//Define default groups
	//groups: can group related constraints
	public Class<?>[] groups() default{};
	//Define default payloads
	//Payloads: provide custom details about validation failure (security level, error code, etc)
	public Class<? extends Payload>[] payload() default {};
}
