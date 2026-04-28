package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.model.Users;
import com.example.demo.service.OneToOneService;

@RequestMapping("/api/v1")
@RestController
public class OneToOneController {
	
	@Autowired
	OneToOneService oneToOne;
	
	@PostMapping("/onetone")
	public void save(@RequestBody Users u) {
	
		oneToOne.save(u);	
	}
	
	@GetMapping("/fetch/{id}")
	public Users fetchDetails(@PathVariable("id") Integer id) {
	
		return oneToOne.fetchDetails(id);
	}

}
