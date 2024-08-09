package com.example.microservice.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.microservice.student.Repo.StudentRepo;
import com.example.microservice.student.entity.College;
import com.example.microservice.student.entity.Student;
import com.example.microservice.student.feignService.CollegeService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CollegeService collegeService;

	@Override
	public ResponseEntity<?> addStudent(Student student) {

		return new ResponseEntity<>(studentRepo.save(student), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getStudentById(Long id) {
		 Student student = studentRepo.findById(id).get();
		 if(student==null) {
			 return new ResponseEntity<>("Student not found", HttpStatus.PRECONDITION_FAILED);
		 }
		 //get the colllege details
		
		// College college = restTemplate.getForObject("http://College-Service/college/{id}",College.class ,id);
		 //feignClientCalling
		 ResponseEntity<College> college = collegeService.getCollegeByStudentId(id);
		 
		 student.setCollege(college.getBody());
		 return new ResponseEntity<>(student, HttpStatus.OK);
	}

}
