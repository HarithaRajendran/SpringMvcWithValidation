package com.asahi.springWithValidation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);		
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Customer theCustomers = new Customer();
		
		model.addAttribute("customers", theCustomers);
		
		return "customer-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customers") Customer theCustomer,
							BindingResult theBindingResult) {
		
		System.out.println("gghjgjgh"+theBindingResult);
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "confirm-page";
		}
	}
}
