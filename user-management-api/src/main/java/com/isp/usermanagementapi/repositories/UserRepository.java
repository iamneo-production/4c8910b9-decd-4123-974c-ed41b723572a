package com.isp.usermanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isp.usermanagementapi.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	//User findByUserId(Integer userId);
}


