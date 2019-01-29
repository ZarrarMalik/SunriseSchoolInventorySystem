package com.sunrise.curriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunrise.curriculum.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
