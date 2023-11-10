package com.springMVC.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.mvc.model.Customer;

import org.springframework.ui.Model;

@Controller
public class ControllerMVC {

	@Autowired
	CustomerRepo repo;
	
	
	@GetMapping(value="/")
	public String getHome() {
		return "home.jsp";
	}
	
//	@PostMapping(value="/getDetails")
//	public String getDetails(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String email,Model model ) {
//		
//		model.addAttribute("firstname",firstName);
//		model.addAttribute("lastname",lastName);
//		model.addAttribute("email",email);
//		
//		return "success.jsp";
//	}
	
	@PostMapping(value="/getDetails")
	public String getDetails(Customer data,Model model ) {
		repo.save(data);
		model.addAttribute("data", repo.findAll());
		return "success.jsp";
	}
	
	
}
