package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Orders;
import com.example.demo.model.Users;
import com.example.demo.repo.ManyToManyRepo;

@Service
public class ManyToManyService 
{
	@Autowired
	private ManyToManyRepo otr;
	public void saveDetails( Users users) {
////		List<Orders> o =users.getOrders();
////		users.setOrders(o);
//		 for (Orders order : users.getOrders()) {
//		        order.setUser(users); // 🔥 VERY IMPORTANT
//		    }
//		    
		otr.save(users);
	}
    
	public Users fetchUsers(int id) {
		Users u = otr.findById(id).get();
		return u;
	}

}

