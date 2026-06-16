package com.example.demo.service;

import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import com.example.demo.entity.Address;
import com.example.demo.entity.User;
import com.example.demo.repo.AddRepo;
import com.example.demo.repo.UserRepo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

@Service
public class TransactionService {
	
	@Autowired
	AddRepo ar;
	
	@Autowired
	UserRepo ur;
	

//	@Transactional(propagation=Propagation.REQUIRED)
//	public void saveToDb()  {
//		Address add =new Address();
//		add.setId(1);
//		add.setCountry("India11");
//		add.setStateName("Andhra11");
//		ar.save(add);
//	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveToDb1() {
		User uu=new User();
		uu.setId(10);
		uu.setLname("Kiran11");
		uu.setUname("sunil11");
		ur.save(uu);	
		//System.out.println(10/0);
	}
}
