package com.example.microservice.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.microservice.college.dao.CollegeRepo;
import com.example.microservice.college.entity.College;

@Service
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	CollegeRepo collegeRepo;
	
@Override
	public ResponseEntity<?> addCollege(College college) {
		College existcollege = collegeRepo.getByCollegeName(college.getCollegeName());
		if(null !=existcollege) {
			return new ResponseEntity<>("College Name already exist",HttpStatus.PRECONDITION_FAILED);
		}
		
		
		College College = collegeRepo.save(college);
		if(null !=College) {
			return new ResponseEntity<>("College added sucessfulllly",HttpStatus.OK);
		}
		return new ResponseEntity<>("College Insertion failed",HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<?> getcollegeBySId(Long sId) {
		College getcollegeBySId = collegeRepo.getCollegeByStudentId(sId);
		return new ResponseEntity<>(getcollegeBySId,HttpStatus.OK);
	}

}
