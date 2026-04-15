package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dao.User;

@Configuration
public class UserConfig {
	
	@Bean
	public User getUser() {
		return new User("sunil",100);
	}

}
