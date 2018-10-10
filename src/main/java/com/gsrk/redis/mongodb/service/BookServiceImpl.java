package com.gsrk.redis.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.gsrk.redis.mongodb.model.Book;
import com.gsrk.redis.mongodb.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Cacheable(value = "books", key = "#book.id")
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}
	
	@Cacheable(value = "books", key = "#book.id")
	public Book findById(String id) {
		// TODO Auto-generated method stub
		return bookRepository.findOne(id);
	}

	@CachePut(value = "books", key = "#book.id")
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}
	
	@CacheEvict(value = "books", key = "#book.id")
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.delete(book);
	}
	
	

}
