package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Users;

//import com.example.demo.model.Users;

@Repository
public interface ManyToManyRepo extends JpaRepository<Users,Integer>
{

}
