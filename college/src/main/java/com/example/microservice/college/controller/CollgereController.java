package com.example.microservice.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.college.entity.College;
import com.example.microservice.college.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollgereController {
	
	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addCollege(@RequestBody College college) {
		return collegeService.addCollege(college);
	}
	
	@GetMapping("/{sId}")
	ResponseEntity<?> getcollegeBySId(@PathVariable Long sId){
		return collegeService.getcollegeBySId(sId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
