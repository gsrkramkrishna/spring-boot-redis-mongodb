package com.gsrk.redis.mongodb.service;

import java.util.List;

import com.gsrk.redis.mongodb.model.Author;

public interface AuthorService {
	
	List<Author> findAllAuthor();
	
	Author findById(String id);
	
	void saveAuthor(Author author);
	
	void deleteAuthor(Author author);

}
