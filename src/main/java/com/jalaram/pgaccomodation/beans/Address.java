package com.jalaram.pgaccomodation.beans;

import java.io.Serializable;

import com.jalaram.pgaccomodation.customvalidation.isValidCity;

public class Address  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@isValidCity(listOfValidCities="Jamnagar|Rajkot|Junagadh|Ahmedabad|Surat")
	String city;
	
	String state;
	
	String country;
	
	String pincode;
	
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}
}
