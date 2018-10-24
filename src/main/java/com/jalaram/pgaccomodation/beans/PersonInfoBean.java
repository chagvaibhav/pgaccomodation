package com.jalaram.pgaccomodation.beans;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.jalaram.pgaccomodation.customvalidation.isValidPhone;

public class PersonInfoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Pattern(regexp="[^0-9]*")
	@Size(min=3,max=20)
	String firstName;
	
	@Pattern(regexp="[^0-9]*")
	String middleName;
	
	@Pattern(regexp="[^0-9]*") 
	String lastName;
	
	@isValidPhone
	String mobile;
	
	@Past
	Date dob;
	
	Address address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonInfoBean [firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", mobile=" + mobile
				+ ", dob=" + dob + ", address=" + address + "]";
	}
	
}