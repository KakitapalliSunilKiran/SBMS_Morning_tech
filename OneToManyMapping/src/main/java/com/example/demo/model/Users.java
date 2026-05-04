package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
//Spring security
//Transaction Management
@Entity
public class Users {
	
	@Id
	private Integer id;
	
	private String name;
	
//	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JsonIgnore
//	List<Orders> orders=new ArrayList<>();


	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Orders> orders;
	
	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Orders> getOrders() {
		return orders;
	}


	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	
	

}
