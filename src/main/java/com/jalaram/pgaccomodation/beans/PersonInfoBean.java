package com.jalaram.pgaccomodation.beans;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

public class PersonInfoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Size(min=10,max=20)
	String firstName;
	String middleName;
	String lastName;
	Long mobile;
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
	
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
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