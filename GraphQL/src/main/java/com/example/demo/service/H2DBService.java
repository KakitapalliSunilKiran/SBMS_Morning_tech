package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.H2DBRepository;

@Service
public class H2DBService {
	
	@Autowired
	H2DBRepository h2db;
	
	public Optional<Student> findById(Integer id) {
		return h2db.findById(id);
	}
	//Conne con
	//prepared stmt
	//result set
	//java dto
	//loadimng
	//closing conne
	
	public void saveToDb(Student s) {
		h2db.save(s);
	}
	
	public void updateRecord(Integer id,String name) {
		
		Optional<Student> s=h2db.findById(id);
		s.get().setSname(name);
		h2db.save(s.get());
	}
	
	public void deleteById(Integer id) {
		h2db.deleteById(id);
	}


}
