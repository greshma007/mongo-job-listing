package com.telusko.joblisting.repositories;

import com.telusko.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

    // MongoRepository - takes care of all CRUD ops
	
}
