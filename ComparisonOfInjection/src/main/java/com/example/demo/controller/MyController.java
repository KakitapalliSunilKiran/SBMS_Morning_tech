package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.OwnCustomException;
import com.example.demo.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	MyService myService;
	
	   @GetMapping("/message")
	    public String getMessage() {

	        String response = myService.getMessage();

	        if (response == null || response.isEmpty()) {
	            throw new OwnCustomException("Message not found");
	        }

	        return response;
	    }

}
