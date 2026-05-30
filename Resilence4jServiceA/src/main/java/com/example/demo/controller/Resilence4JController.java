package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Resilence4jService;

@RestController
public class Resilence4JController {
	
	@Autowired
	Resilence4jService rs;
	
	@GetMapping("/order")
	public String getMessage() {
		return rs.getMessage();
	}
}
