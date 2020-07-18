package com.sunil_parcha.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunil_parcha.model.UserDetail;

public interface UserDetailRepository extends JpaRepository<UserDetail, Integer> {
	
}
