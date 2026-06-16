package com.example.sunil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekhaApplication.class, args);
	}

}
