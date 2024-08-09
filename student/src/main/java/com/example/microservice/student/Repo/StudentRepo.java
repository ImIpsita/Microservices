package com.example.microservice.student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice.student.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
