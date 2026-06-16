package com.example.sunil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekhaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekhaClient1Application.class, args);
	}

}
