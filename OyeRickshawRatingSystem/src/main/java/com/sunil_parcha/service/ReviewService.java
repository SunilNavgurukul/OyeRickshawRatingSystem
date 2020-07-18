package com.sunil_parcha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil_parcha.Repository.ReviewRepository;
import com.sunil_parcha.model.Review;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewrepo;
	
	public List<Review> findAllById(int id){	
		return reviewrepo.findAllByreviewee_id(id);
	}

	
	public Review add(Review user) {
		return reviewrepo.save(user);
	}


	public List<Review> findAll() {
		return reviewrepo.findAll();
	}

	

}
