package com.gsrk.redis.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsrk.redis.mongodb.model.Author;

public interface AuthorRepository  extends MongoRepository<Author, String> {

}
