package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	
//	
//	public Users getUser() {
//		return user;
//	}
//	public void setUser(Users user) {
//		this.user = user;
//	}
	@Id
	@Column(name = "AID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer aid;
	@Column(name = "DEPT")
	private String dept;
	@Column(name = "DESIGNATION")
	private String designation;
	 @Column(name = "LOCATION")
	private String location;
	
	
//	@OneToOne(mappedBy = "ad")
//	@JsonBackReference
//	private Users user;
//	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
