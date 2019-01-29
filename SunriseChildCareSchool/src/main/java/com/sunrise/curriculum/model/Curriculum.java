package com.sunrise.curriculum.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curriculum {
	@Id
	private int curriculum_id;
	private Set<Book> books;
	
	
	public Curriculum() {
		super();
	}
	public int getCurriculum_id() {
		return curriculum_id;
	}
	public void setCurriculum_id(int curriculum_id) {
		this.curriculum_id = curriculum_id;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	
}
