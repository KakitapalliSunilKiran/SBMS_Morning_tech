package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/payment")
	public String getPayment() {
		return "Payment has been Succesfully processed";
	}

}
