package com.example.sunil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroController {
	
	@GetMapping("/greet")
	public String getMessage() {
		return "Happy New Year";
	}

}
