package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.H2DBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class H2DBController {

    @Autowired
    private H2DBService h2DBService;

    // Equivalent to GET /greet
    @QueryMapping
    public String greet() {
        return "Happy New Year";
    }

    // Equivalent to GET /fetch/{id}
    @QueryMapping
    public Optional<Student> findById(@Argument Integer id) {
        return h2DBService.findById(id);
    }

    // Equivalent to POST /store
    @MutationMapping
    public String storeStudent(@Argument("studentInput") Student student1) {

        Student student = new Student();
        student.setId(student1.getId());
        student.setSname(student1.getSname());
        h2DBService.saveToDb(student);
        return "Student saved successfully";
    }

    // Equivalent to PUT /update/{id}/{uname}
    @MutationMapping
    public String updateStudent(@Argument Integer id,
                                @Argument String uname) {

        h2DBService.updateRecord(id, uname);
        return "Record updated successfully";
    }

    // Equivalent to DELETE /delete/{id}
    @MutationMapping
    public String deleteStudent(@Argument Integer id) {

        h2DBService.deleteById(id);
        return "Record deleted successfully";
    }

}