package com.example.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testapp.service.IntroService;

@RestController
public class IntroController {
	
	@Autowired
	IntroService service;
	
	@GetMapping("/api")
	public String getMessage() {
		return service.getMessage();
	}

}
