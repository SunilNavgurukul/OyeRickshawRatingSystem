package com.sunil_parcha.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"reviewee", "reviewer"})
public class UserDetail {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "reviewee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Review> reviewee;
	
	@OneToMany(mappedBy = "reviewer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Review> reviewer;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private Roles role;
	
	
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Review> getReviewee() {
		return reviewee;
	}

	public void setReviewee(Set<Review> reviewee) {
		this.reviewee = reviewee;
	}

	public Set<Review> getReviewer() {
		return reviewer;
	}

	public void setReviewer(Set<Review> reviewer) {
		this.reviewer = reviewer;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}
	
}
