package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.exceptions.OwnCustomException;

@Repository
public class MyRepo {
	
	public String getMessage() {
		throw new OwnCustomException("My Own Exception");
	}

}
