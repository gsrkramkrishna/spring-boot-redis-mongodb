package com.gsrk.redis.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsrk.redis.mongodb.model.Author;
import com.gsrk.redis.mongodb.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorRepository authorRepository;
	public List<Author> findAllAuthor() {
		// TODO Auto-generated method stub
		return authorRepository.findAll();
	}

	public Author findById(String id) {
		// TODO Auto-generated method stub
		return authorRepository.findOne(id);
	}

	public void saveAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepository.save(author);
	}

	public void deleteAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepository.delete(author);
	}

}
