package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//
//import jakarta.transaction.Transactional;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Address;
import com.example.demo.repo.AddRepo;
import com.example.demo.repo.UserRepo;

import org.springframework.transaction.annotation.Propagation;

@Service
public class ServiceClass1 {
	
	@Autowired
	AddRepo ar;
	
	@Autowired
	UserRepo ur;
	
	@Autowired
	TransactionService ts;
	
//	@Transactional(propagation=Propagation.REQUIRED)
//	public void testTransaction() throws Exception {
//		ts.saveToDb();
//		ts.saveToDb1();	
//	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void testTransaction()   {
		Address add =new Address();
		add.setId(1);
		add.setCountry("India");
		add.setStateName("Andhra");
		ar.save(add);
		ts.saveToDb1();
		System.out.println(10/0);
	}

}

//Service Class 1 -> Address details
//Transaction Service -> User detail
