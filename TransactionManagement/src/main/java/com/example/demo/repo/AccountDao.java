//package com.example.demo.repo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class AccountDao {
//	
//	 	@Autowired
//	    private JdbcTemplate jdbcTemplate;
//
//	    public void save(String name, double balance) {
//	        String sql = "INSERT INTO account(name, balance) VALUES (?, ?)";
//	        jdbcTemplate.update(sql, name, balance);
//	    }
//
//}
