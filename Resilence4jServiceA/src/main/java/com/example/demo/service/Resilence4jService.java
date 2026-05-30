package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class Resilence4jService {
	
	@Autowired
	RestTemplate rt;
	
	@CircuitBreaker(name="Resilence4jServiceB",fallbackMethod="fallbackMethod")
	public String getMessage() {
		return rt.getForObject("http://localhost:8081/payment", String.class);
	}
	
	public String fallbackMethod(Exception ex) {
		return "Payment service is not available";
	}

}
