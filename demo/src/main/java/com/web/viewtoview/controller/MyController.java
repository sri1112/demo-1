package com.web.viewtoview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/contacturl")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("/abouturl")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/loginurl")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/registerurl")
	public String register() {
		return "register";
	}

}
