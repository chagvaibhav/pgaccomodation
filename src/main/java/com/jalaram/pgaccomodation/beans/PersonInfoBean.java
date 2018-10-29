package com.jalaram.pgaccomodation.beans;

import java.io.Serializable;
import java.util.Date;

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
	String name;
	
	@isValidPhone
	String mobile;

	Date dob;
	
	Address address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "PersonInfoBean [name=" + name + ", mobile=" + mobile + ", dob="
				+ dob + ", address=" + address + "]";
	}
}