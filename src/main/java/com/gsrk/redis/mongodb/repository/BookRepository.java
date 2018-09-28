package com.gsrk.redis.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsrk.redis.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
