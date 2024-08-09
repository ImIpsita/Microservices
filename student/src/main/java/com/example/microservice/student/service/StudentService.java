package com.example.microservice.student.service;

import org.springframework.http.ResponseEntity;

import com.example.microservice.student.entity.Student;

public interface StudentService {
	
	ResponseEntity<?> addStudent(Student student);

	ResponseEntity<?> getStudentById(Long id);
	
	//ResponseEntity<?> getcollegeBySId(Long sId);

}
