package com.example.microservice.college.service;

import org.springframework.http.ResponseEntity;

import com.example.microservice.college.entity.College;

public interface CollegeService {
	
   public ResponseEntity<?> addCollege(College college);
	
	public ResponseEntity<?> getcollegeBySId(Long sId);

}
