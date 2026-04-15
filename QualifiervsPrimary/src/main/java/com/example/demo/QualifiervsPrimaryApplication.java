package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EntryService;

@SpringBootApplication
public class QualifiervsPrimaryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(QualifiervsPrimaryApplication.class, args);
		EntryService es =ctx.getBean(EntryService.class);
		es.playCricket();
	}

}
