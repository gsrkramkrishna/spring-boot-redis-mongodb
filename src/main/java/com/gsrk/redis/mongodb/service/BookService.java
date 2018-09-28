package com.gsrk.redis.mongodb.service;

import java.util.List;

import com.gsrk.redis.mongodb.model.Book;

public interface BookService {
	
	List<Book> findAllBooks();
	
	Book findById(String id);
	
	void saveBook(Book book);
	
	void deleteBook(Book book);

}
