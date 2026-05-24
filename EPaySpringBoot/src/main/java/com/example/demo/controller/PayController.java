package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/payment")
	public String doPayment() {
		String port=env.getProperty("server.port");
		return "Payment service is running on "+port;
	}

}
