package com.example.demo.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.model.Customer1;
import com.example.demo.repo.DbRepo;
@Component
public class MyUserDetailsService implements UserDetailsService
{
	
	@Autowired
	private DbRepo dr;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Customer1 c = dr.findByUserName(username);
		return new User(c.getUserName(), c.getPwd(), Collections.emptyList());
	}

}
