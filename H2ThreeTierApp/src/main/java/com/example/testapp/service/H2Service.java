package com.example.testapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testapp.model.Student;
import com.example.testapp.repository.CrudRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public class H2Service {
	
	@Autowired
	CrudRepo cr;
	
	 @PersistenceContext
	    private EntityManager entityManager;
	
	public void storeTodB(Student s) {
		cr.save(s);
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
	
	public Student getStudentDetailsByName(String str) {
		return cr.findByName(str);
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
	
//	public List<Student> fetchStudentDetails()
//	{
////		PageRequest pr= PageRequest.of(2, 2);
////		Page<Student> page= cr.findAll(pr);
////		List<Student> list = page.getContent();
////		Sort s= Sort.by("name");
////		return cr.findAll(s);
//		Student probe = new Student();
//		probe.setName("Sunil");
//
//		Example<Student> example = Example.of(probe);
//
//		List<Student> result = cr.findAll(example);
//		return result;
//	}
	//10 records are there 
	//2 records
	
	public List<Student> fetchStudentDetails() {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);

        Root<Student> root = cq.from(Student.class);

        // Equivalent to probe.setName("Sunil")
        Predicate predicate = cb.equal(root.get("name"), "Sunil");

        cq.select(root).where(predicate);

        return entityManager.createQuery(cq).getResultList();
    }
	
	public Student fetchStudentDetailsSingle(int id) {
		return cr.fetchStudentDetailsSingle(id);
	}
	
	public Student fetchStudentDetailsMultiple(int id) {
		return cr.fetchStudentDetailsMultiple(id);
	}

	public void deleteRecord(int id) {
		 cr.deleteRecord(id);
	}
	
	

}
