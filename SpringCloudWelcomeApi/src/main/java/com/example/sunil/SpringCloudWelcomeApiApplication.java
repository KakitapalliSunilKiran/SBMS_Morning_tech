package com.example.sunil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudWelcomeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudWelcomeApiApplication.class, args);
	}

}
