package com.sunrise.curriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunrise.curriculum.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
