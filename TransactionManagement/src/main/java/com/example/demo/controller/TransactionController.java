package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceClass1;
import com.example.demo.service.TransactionService;

@RestController
@RequestMapping("/api/v1")
public class TransactionController {
	
	@Autowired
	TransactionService ts;
	@Autowired
	ServiceClass1 sc;
	
	@PostMapping("/save")
	public void storeToDb() throws Exception{

		sc.testTransaction();
	}
	
}
