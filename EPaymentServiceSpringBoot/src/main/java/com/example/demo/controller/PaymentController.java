package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class PaymentController {
	
	@GetMapping("/fetch")
	public String getMessage() {
		return "Hey this is SUnil";
	}

}
