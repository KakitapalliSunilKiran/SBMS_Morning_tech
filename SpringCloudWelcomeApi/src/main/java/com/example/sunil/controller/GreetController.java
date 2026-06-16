package com.example.sunil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@Autowired
	Environment env;
	
	@GetMapping("/api")
	public String getMesage() {
		String portNum= env.getProperty("local.server.port");
		return "Welcome Sunil"+portNum;
	}
//round robin
}
