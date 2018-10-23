package com.jalaram.pgaccomodation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jalaram.pgaccomodation.beans.PersonInfoBean;

@Controller
public class RentController {
	
	@RequestMapping("/")
	ModelAndView getPerson() {
		System.out.println("default persion");
		return new ModelAndView("person");
	}
	
	@RequestMapping("/person")
	ModelAndView getPersonForm(@ModelAttribute("personInfo") PersonInfoBean personInfo /*@RequestParam(value = "firstName", defaultValue = "Bhai Name to type karo") String firstName,	@RequestParam("middleName") String middleName,
			@RequestParam("lastName") String lastName,	@RequestParam("city") String city,
			@RequestParam("state") String state,@RequestParam("country") String country*/) {
		
	/*	PersonInfoBean personInfo =new PersonInfoBean();
		personInfo.setFirstName(firstName);
		personInfo.setMiddleName(middleName);
		personInfo.setLastName(lastName);
		personInfo.setCity(city);
		personInfo.setState(state);
		personInfo.setCountry(country);*/
		
		System.out.println("/person");
		ModelAndView mv= new ModelAndView("PersonInfoDisplay");
		//mv.addObject("personInfo", personInfo);
		return mv;
	}
}