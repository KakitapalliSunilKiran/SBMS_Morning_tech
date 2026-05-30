package com.example.testapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testapp.model.Student;
import com.example.testapp.repository.CrudRepo;

import jakarta.transaction.Transactional;

@Service
public class H2Service {
	
	@Autowired
	CrudRepo cr;
	
	@Transactional
	public void storeTodB(Student s) {
		throw new RuntimeException();
	}
	
	public Student getStudentDetails(int id) {
		Optional<Student> s=cr.findById(id);
		if(s.isPresent()) {
			return s.get();
		}
		else {
			return new Student();
		}
		
	}
	
	public Student updateStudentDetails(int id,String name) {
		Optional<Student> s=cr.findById(id);
		if(s.isPresent()) {
			Student s1= s.get();
			s1.setName(name);
			cr.save(s1);
			return s1;
		}
		else {
			return new Student();
		}
	}
	
	public Student deleteStudentDetailsMethod(int id) {
		Optional<Student> s=cr.findById(id);
		if(s.isPresent()) {
			Student del=s.get();
			cr.deleteById(id);
			return del;
		}
		else {
			return new Student();
		}
	}

}
