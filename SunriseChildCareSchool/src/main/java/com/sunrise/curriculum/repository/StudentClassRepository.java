package com.sunrise.curriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunrise.curriculum.model.StudentClass;

public interface StudentClassRepository extends JpaRepository<StudentClass, Integer>{

}
