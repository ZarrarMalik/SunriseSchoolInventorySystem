package com.sunrise.curriculum.model;

import javax.persistence.Id;

public class Book {
	@Id
	private int book_id;
	private String bookName;
	private String bookClass;
	private String quantity;

}
