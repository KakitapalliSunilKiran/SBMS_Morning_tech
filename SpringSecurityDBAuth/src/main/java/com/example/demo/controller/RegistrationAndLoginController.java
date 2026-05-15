package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer1;
import com.example.demo.service.JwtService;
import com.example.demo.service.RegistrationAndLoginService;

@RequestMapping("api/v1")
@RestController
public class RegistrationAndLoginController {
	
	@Autowired
	RegistrationAndLoginService ras;
	
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	JwtService jwt;
	
	
	@PostMapping("/register")
	public void registration(@RequestBody Customer1 c1) {
		ras.register(c1);
	}
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to Durgasoft";
	}

	@GetMapping("/login")
	public  ResponseEntity<String> loginToDurgasoft(@RequestBody Customer1 c1) {
		UsernamePasswordAuthenticationToken token = 
				new UsernamePasswordAuthenticationToken(c1.getUserName(), c1.getPwd());

		try {
			Authentication authenticate = authManager.authenticate(token);

			if (authenticate.isAuthenticated()) {
				String jwtToken = jwt.generateToken(c1.getUserName());
				return new ResponseEntity<>(jwtToken, HttpStatus.OK);
			}

		} catch (Exception e) {
			//logger
			e.printStackTrace();
		}

		return new ResponseEntity<String>("Invalid Credentials", HttpStatus.BAD_REQUEST);
		
	}
}
