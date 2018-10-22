package com.jalaram.pgaccomodation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RentController {
	
	@RequestMapping("/")
	ModelAndView getPerson() {
		return new ModelAndView("person");
	}
	
	@RequestMapping("/person")
	ModelAndView getPersonForm(@RequestParam("personName") String personName) {
		ModelAndView mv= new ModelAndView("PersonInfoDisplay");
		mv.addObject("personName", personName);
		return mv;
	}
}