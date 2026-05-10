package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Customer1;

public interface DbRepo extends JpaRepository<Customer1,Integer>
{
	Customer1 findByUserName(String uname);
}
