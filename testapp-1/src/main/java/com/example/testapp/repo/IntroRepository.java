package com.example.testapp.repo;

import org.springframework.stereotype.Repository;

@Repository
public class IntroRepository {
	
	public String getMessage() {
		return "Hi I am the DB Layer";
	}

}
