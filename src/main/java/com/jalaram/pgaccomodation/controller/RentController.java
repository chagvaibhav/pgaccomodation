package com.jalaram.pgaccomodation.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jalaram.pgaccomodation.beans.PersonInfoBean;
import com.jalaram.pgaccomodation.beans.PersonNameEditor;

@Controller
public class RentController {

	@InitBinder
	public void init(WebDataBinder binder){
		binder.setDisallowedFields(new String[]{"mobile"});
		SimpleDateFormat userFormat =new SimpleDateFormat("YYYY-MM-dd");
		binder.registerCustomEditor(Date.class,"dob", new CustomDateEditor(userFormat, false));
		binder.registerCustomEditor(String.class,"firstName",new PersonNameEditor());
	}

	@RequestMapping("/")
	ModelAndView getPerson() {
		System.out.println("default persion");
		return new ModelAndView("person");
	}

	@ModelAttribute
	void getCommonObjects(Model model1){
		System.out.println("Get Common Objects");
		model1.addAttribute("headerMessage","PG Accomodation");
	}

	@RequestMapping("/person")
	ModelAndView getPersonForm(@Valid @ModelAttribute("personInfo") PersonInfoBean personInfo /*@RequestParam(value = "firstName", defaultValue = "Bhai Name to type karo") String firstName,	@RequestParam("middleName") String middleName,
			@RequestParam("lastName") String lastName,	@RequestParam("city") String city,
			@RequestParam("state") String state,@RequestParam("country") String country*/,BindingResult result) {

		/*	PersonInfoBean personInfo =new PersonInfoBean();
		personInfo.setFirstName(firstName);
		personInfo.setMiddleName(middleName);
		personInfo.setLastName(lastName);
		personInfo.setCity(city);
		personInfo.setState(state);
		personInfo.setCountry(country);*/

		System.out.println("/person");
		if (result.hasErrors()){
			ModelAndView mv= new ModelAndView("person");
			//mv.addObject("personInfo", personInfo);
			return mv;
		}

		ModelAndView mv= new ModelAndView("PersonInfoDisplay");
		//mv.addObject("personInfo", personInfo);
		return mv;
	}
}