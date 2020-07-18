package com.sunil_parcha.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Review {

	@Id
	@GeneratedValue
	private int id;

	private int rating;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="reviewer")
    private UserDetail reviewer;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="reviewee")
    private UserDetail reviewee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public UserDetail getReviewer() {
		return reviewer;
	}

	public void setReviewer(UserDetail reviewer) {
		this.reviewer = reviewer;
	}

	public UserDetail getReviewee() {
		return reviewee;
	}

	public void setReviewee(UserDetail reviewee) {
		this.reviewee = reviewee;
	}

	
	
	
}
