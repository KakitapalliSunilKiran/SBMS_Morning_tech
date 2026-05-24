package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="EPAYSPRINGBOOT")
public interface PaymentFeignClient {
	
	@GetMapping("/payment")
	public String doPayment();

}
