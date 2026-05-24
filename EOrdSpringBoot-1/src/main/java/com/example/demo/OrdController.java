package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdController {
	
	@Autowired
	PaymentFeignClient paymentFeignClient;
	
	@GetMapping("/ord")
	public String getOrderMessage() 
	{
		String paymentStatus=paymentFeignClient.doPayment();
		String Ordermessage="Order has placed with id 1234";
		return paymentStatus+Ordermessage;
	}

}
