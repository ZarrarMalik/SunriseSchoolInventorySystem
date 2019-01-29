package com.sunrise.curriculum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunrise.curriculum.model.Book;
import com.sunrise.curriculum.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

	
	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/add")
	public String addingBooks(@RequestBody Book book) {
		bookRepository.save(book);
		return "Books added....";
	}
	
}
