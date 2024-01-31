package com.telusko.joblisting.repositories;

import java.util.List;

import com.telusko.joblisting.models.Post;

public interface SearchRepository {

	public List<Post> findByText(String text);
	
}
