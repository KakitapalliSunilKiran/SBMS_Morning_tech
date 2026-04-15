package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.User;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(BeanLifeCycleApplication.class, args);
		 User u=ctx.getBean(User.class);
		 System.out.println(u.name);
		 System.out.println(u.marks);
	}

}
