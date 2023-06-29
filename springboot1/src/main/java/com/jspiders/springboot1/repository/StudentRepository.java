package com.jspiders.springboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspiders.springboot1.pojo.StudentPOJO;

public interface StudentRepository extends JpaRepository<StudentPOJO, Integer>{
	StudentPOJO findByName(String name);
	StudentPOJO findByAddress(String address);

}
