package com.example.microservice.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.student.entity.Student;
import com.example.microservice.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	ResponseEntity<?> addStudent(@RequestBody Student student){
		
		return studentService.addStudent(student);
		}
	
	@GetMapping("/{Id}")
	ResponseEntity<?> getStudentById(@PathVariable("Id") Long id){
		
		return studentService.getStudentById(id);
		}

}
