package com.example.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"ds.pack","com.example.testapp"})
public class Testapp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Testapp1Application.class, args);
		System.out.println(ctx.getClass().getName());
		System.out.println(ctx.getBeanDefinitionCount());
	}

}
