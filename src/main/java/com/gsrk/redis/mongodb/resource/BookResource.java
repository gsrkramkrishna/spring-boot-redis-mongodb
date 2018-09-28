package com.gsrk.redis.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsrk.redis.mongodb.model.Book;
import com.gsrk.redis.mongodb.service.BookService;

@RestController
@RequestMapping("/v1")
public class BookResource {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping(value="/book")
	public void saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
	}
	
	@PutMapping(value="/book")
	public void updateBook(@RequestBody Book book) {
		bookService.saveBook(book);
	}
	
	@DeleteMapping(value="/book")
	public void deleteBook(@RequestBody Book book) {
		bookService.deleteBook(book);
	}
	
	@GetMapping(value="/book/{id}")
	public Book findBookById(@PathVariable String id) {
		return bookService.findById(id);
	}
	
	@GetMapping(value="/book/all")
	public List<Book> findByAll() {
		return bookService.findAllBooks();
	}

}
