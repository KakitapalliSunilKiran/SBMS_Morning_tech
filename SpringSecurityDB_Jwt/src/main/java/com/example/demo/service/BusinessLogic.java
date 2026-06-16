package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer1;
import com.example.demo.repo.DbRepo;

@Service
public class BusinessLogic {
	
	@Autowired
	DbRepo dr;
	
	@Autowired
	PasswordEncoder pe;
	
	public void registerUser(Customer1 c) {
		c.setPwd(pe.encode(c.getPwd()));
		dr.save(c);	
	}

}
