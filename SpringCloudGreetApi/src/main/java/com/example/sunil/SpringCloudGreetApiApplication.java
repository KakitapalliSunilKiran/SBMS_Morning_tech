package com.example.sunil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudGreetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGreetApiApplication.class, args);
	}

}
