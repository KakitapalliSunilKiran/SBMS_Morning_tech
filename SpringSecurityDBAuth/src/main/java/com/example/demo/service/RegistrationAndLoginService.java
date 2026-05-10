package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer1;
import com.example.demo.repo.DbRepo;

@Service
public class RegistrationAndLoginService {
	
	@Autowired
	private PasswordEncoder pe;
	
	@Autowired
	DbRepo dr;
	
	public void register(Customer1 c1) {
		c1.setPwd(pe.encode(c1.getPwd()));
		dr.save(c1);
	}

}
