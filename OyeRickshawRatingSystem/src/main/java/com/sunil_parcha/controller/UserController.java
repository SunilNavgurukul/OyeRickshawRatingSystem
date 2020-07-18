package com.sunil_parcha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil_parcha.model.Review;
import com.sunil_parcha.service.ReviewService;

@RestController
public class UserController {
	
	@Autowired
	private ReviewService reviewservice;
		

	
	@GetMapping(value = "/all")
	public List<Review> findAll() {
		return reviewservice.findAll();
		
	}
	
	@GetMapping(value = "/review/{id}")
	public List<Review> review(@PathVariable("id") int id) {
		return reviewservice.findAllById(id);
		
	}
	
	@PostMapping(value = "/review-post")
	public void review_post(@RequestBody Review user) {
		reviewservice.add(user);
		
	}
	

}
