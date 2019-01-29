package com.sunrise.curriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunrise.curriculum.model.Curriculum;

public interface CurriclumRepository extends JpaRepository<Curriculum, Integer> {

}
