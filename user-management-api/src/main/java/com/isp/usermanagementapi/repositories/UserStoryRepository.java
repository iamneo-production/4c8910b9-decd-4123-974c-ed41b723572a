package com.isp.usermanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isp.usermanagementapi.entities.Story;
import com.isp.usermanagementapi.entities.UserStory;

public interface UserStoryRepository extends JpaRepository<UserStory, Integer> {

	public UserStory findByStory(Story story);

}
