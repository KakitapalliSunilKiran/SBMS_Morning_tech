package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {
	
	@Value("${secret}")
	public String secret;
	
	@GetMapping("/fetch")
	public String getSecret() {
		return "my secret is "+secret;
	}
	
	

}
