package com.sunrise.curriculum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunrise.curriculum.model.Student;
import com.sunrise.curriculum.repository.StudentRepository;

@RestController
public class AdminController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody Student student) {
		studentRepository.save(student);
		return "User added Successfully.....";
	}

}
