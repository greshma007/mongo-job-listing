package com.telusko.joblisting.controllers;

import com.telusko.joblisting.models.Post;
import com.telusko.joblisting.repositories.PostRepository;
import com.telusko.joblisting.repositories.SearchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private SearchRepository searchRepository;

	/**
	 * When we request for home page, display Swagger main page
	 *
	 * @param response
	 */
	@ApiIgnore // removes all the unwanted predefined requests from swagger
	@GetMapping("/")
	@CrossOrigin
	public void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}

	/**
	 * Get all posts
	 * 
	 * @return
	 */
	@GetMapping("/allPosts")
	@CrossOrigin
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}

	@PostMapping("/post")
	@CrossOrigin
	public Post createPost(@RequestBody Post post) {
		return postRepository.save(post);
	}

	@GetMapping("/posts/{text}")
	@CrossOrigin
	public List<Post> searchPost(@PathVariable String text) {
		return searchRepository.findByText(text);
	}

}
