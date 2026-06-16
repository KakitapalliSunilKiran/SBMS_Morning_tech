package com.example.demo.controller;

//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer1;
import com.example.demo.service.BusinessLogic;
import com.example.demo.service.JwtService;

@RestController
public class Entrypoint {
	
	@Autowired
	BusinessLogic bl;
	
	@Autowired
	JwtService jwt;
	
	@Autowired
	private AuthenticationManager authManager;
	
	
	@GetMapping("/welcome")
	public String getGreeting() {
		return "Welcome to Durgasoft";
	}
	
	
	@PostMapping("/register")
	public void registerUser(@RequestBody Customer1 c) {
		bl.registerUser(c);
	}
	
	//Security Context
	//
	@PostMapping("/login")
	public ResponseEntity<String> loginCheck(@RequestBody Customer1 c) {
		
		UsernamePasswordAuthenticationToken token = 
				new UsernamePasswordAuthenticationToken(c.getUserName(), c.getPwd());

		try {
			Authentication authenticate = authManager.authenticate(token);

			if (authenticate.isAuthenticated()) {
				String jwtToken = jwt.generateToken(c.getUserName());
				return new ResponseEntity<>(jwtToken, HttpStatus.OK);
			}

		} catch (Exception e) {
			//logger
		}

		return new ResponseEntity<String>("Invalid Credentials", HttpStatus.BAD_REQUEST);
	}


}
