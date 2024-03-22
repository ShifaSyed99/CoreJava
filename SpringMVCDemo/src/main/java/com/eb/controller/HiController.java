package com.eb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiController {
	
	@RequestMapping("/")
	public String info() {
		
		return "index";
	}

	@RequestMapping("/hello")
	
	public String disp() {
		
		return "register";
	}
}
