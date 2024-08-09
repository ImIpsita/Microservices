package com.example.microservice.student.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservice.student.entity.College;

@FeignClient(name = "College-Service")
public interface CollegeService {
	
	@GetMapping("/college/{id}")
	ResponseEntity<College> getCollegeByStudentId(@PathVariable Long id);
		


}
