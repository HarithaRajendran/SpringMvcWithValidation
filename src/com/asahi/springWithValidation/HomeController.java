package com.asahi.springWithValidation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String firstPage() {
		return "main-menu";
	}
}
