package com.example.microservice.college.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.microservice.college.entity.College;
@Repository
public interface CollegeRepo extends JpaRepository<College, Long> {

   @Query("select c from College c where c.collegeName =:collegeName")
	College getByCollegeName(String collegeName);

    College getCollegeByStudentId(Long sId);
	

}
