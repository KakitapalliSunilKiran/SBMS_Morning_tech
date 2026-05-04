package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Orders;
import com.example.demo.model.Users;
import com.example.demo.repo.OneToManyRepos;

@Service
public class OneToManyService 
{
	@Autowired
	private OneToManyRepos otr;
	public void saveDetails( Users users) {
//		List<Orders> o =users.getOrders();
//		users.setOrders(o);
		 for (Orders order : users.getOrders()) {
		        order.setUser(users); // 🔥 VERY IMPORTANT
		    }
		    
		otr.save(users);
	}
    
	public Users fetchUsers(int id) {
		Users u = otr.findById(id).get();
		Orders o =u.getOrders().get(0);
		return o.getUser();
	}

}
