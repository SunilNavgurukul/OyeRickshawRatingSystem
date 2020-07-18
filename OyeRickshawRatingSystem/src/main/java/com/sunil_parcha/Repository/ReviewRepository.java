package com.sunil_parcha.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sunil_parcha.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{

	@Query(value="select * from review inner join user_detail on  review.reviewer_id = user_detail.id  where reviewee_id = :id", nativeQuery = true)
	 List<Review> findAllByreviewee_id(int id);

	
}

