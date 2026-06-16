package com.example.sunil.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SpringCloudWelcomeApi")
public interface FeignInterface {
	
	@GetMapping("/api")
	public String getMesage();

}
