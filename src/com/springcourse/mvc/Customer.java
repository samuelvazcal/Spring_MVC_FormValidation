package com.springcourse.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	/**
	 * Added validation rules for my Customer class for my lastName field
	 * @NotNull -> Checks that the annotated value is not null
	 * @Size -> Size must match the given size
	 */
	@NotNull(message="isrequired")
	@Size(min=1, message="is required")
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	

}
