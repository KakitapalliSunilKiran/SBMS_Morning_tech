package com.example.testapp.model;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Student {
	
	@Id
	@GenericGenerator(
	        name = "custom_id",
	        strategy = "com.example.testapp.service.CustomIdGenerator"
	 )
	@GeneratedValue(generator = "custom_id")
	private String id;

	private String name;
	
	private String clgName;
	
	private Integer marks;
	
	public Student() {
		
	}

	public Student(String id, String clgName) {
		super();
		this.id = id;
		this.clgName = clgName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}
