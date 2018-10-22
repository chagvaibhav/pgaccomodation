package com.jalaram.pgaccomodation.beans;

import java.io.Serializable;

public class PersonInfoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String firstName;
	String middleName;
	String lastName;
	String city;
	String state;
	String country;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "PersonInfoBean [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
}
