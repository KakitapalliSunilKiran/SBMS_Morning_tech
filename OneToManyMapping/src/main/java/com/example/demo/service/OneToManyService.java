package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repo.OneToManyRepos;

@Service
public class OneToManyService 
{
	@Autowired
	private OneToManyRepos otr;
	public void saveDetails( Users users) {
		otr.save(users);
	}

}
