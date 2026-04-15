package com.example.demo.dao;

import org.springframework.stereotype.Component;


public class User {
	
	public String name;
	public int marks;
	
	User(){
		System.out.println("Hi I am in User class"+this.hashCode());
	}

	public User(String name,int marks){
		System.out.println("I am in parameterized constructor");
		this.name=name;
		this.marks=marks;
	}
}
