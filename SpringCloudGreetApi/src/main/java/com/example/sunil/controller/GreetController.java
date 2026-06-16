package com.example.sunil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@Autowired
	FeignInterface fi;
	
	
	@GetMapping("/greet")
	public String greetMessage() {
		String str =fi.getMesage();
		return "Happy Greeting"+str;
	}

}
