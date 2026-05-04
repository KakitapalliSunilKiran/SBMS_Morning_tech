package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.service.ManyToManyService;


@RestController
@RequestMapping("api/v1")
public class ManyToManyController 
{
	@Autowired
	private ManyToManyService ots;
	
	
	@PostMapping("/save")
	public void saveDetails(@RequestBody Users users) {
		
		ots.saveDetails(users);
		
	}
	
	@GetMapping("/fetch/{id}")
	public Users getUsers(@PathVariable("id") Integer id)
	{
		return ots.fetchUsers(id);
	}
	
	
	

}
