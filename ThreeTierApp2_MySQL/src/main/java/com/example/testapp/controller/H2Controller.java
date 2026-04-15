package com.example.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testapp.model.Student;
import com.example.testapp.service.H2Service;

@RestController
@RequestMapping("api/v1/")
public class H2Controller {
	
	@Autowired
	H2Service hs;
	
	@PostMapping("/save")
	public void save(@RequestBody Student s) {
		hs.storeTodB(s);
	}
	
//	@GetMapping("/fetch/{id}")
//	public Student getStudentDetails(@PathVariable("id") int id) {
//		return hs.getStudentDetails(id);
//		
//	}
//	
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable("id") int id) {

	    Student student = hs.getStudentDetails(id);

	    if (student != null) {
	        return ResponseEntity.ok(student);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	
//	@PutMapping("/update/{id}/{name}")
//	public Student updateStudentDetails(@PathVariable("id") int id,@PathVariable("name") String name) {
//		return hs.updateStudentDetails(id,name);
//	}
	
	@PutMapping("/update/{id}/{name}")
	public ResponseEntity<?> updateStudentDetails(@PathVariable("id") int id,
	                                              @PathVariable("name") String name) {

	    Student updatedStudent = hs.updateStudentDetails(id, name);

	    if (updatedStudent != null) {
	        return ResponseEntity.ok(updatedStudent);
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                .body("Student not found with id: " + id);
	    }
	}
	//ResponseEntity
	//Status codes
	
	@DeleteMapping("/delete/{id}")
	public void deleteByIdmethod(@PathVariable("id") int id) 
	{
		hs.deleteStudentDetailsMethod(id);
	}
	
}
