package com.example.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Address;
import com.example.demo.model.Users;
import com.example.demo.repo.OneToOneRepo1;
import com.example.demo.repo.OnetoOneRepo;

@Service
public class OneToOneService {
	@Autowired
	private OnetoOneRepo oneToOne;
	
	@Autowired
	private OneToOneRepo1 oneToOne1;
	
	public void save(Users user) 
	{
	        oneToOne.save(user);
	}
	
	public Users fetchDetails(Integer id) 
	{
		Users u = oneToOne.findById(id).get();
//		Address a = u.getAd();
//		return a.getUser();
		return u;
	}

}
