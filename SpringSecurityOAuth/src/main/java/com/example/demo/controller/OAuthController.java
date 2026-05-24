package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class OAuthController {
	
	@GetMapping("/oauth")
	public String getWelcome() {
		return "Welcome TO DurgaSoft";
	}

}
