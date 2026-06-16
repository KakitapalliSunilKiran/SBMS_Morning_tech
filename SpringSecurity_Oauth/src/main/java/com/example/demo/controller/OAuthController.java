package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/oauth")
public class OAuthController {
	
	@GetMapping("/resource")
	public String getResource() {
		return "Welcome to Oauth";
	}

}
