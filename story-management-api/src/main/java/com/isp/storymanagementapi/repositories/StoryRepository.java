package com.isp.storymanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isp.storymanagementapi.entities.Story;

public interface StoryRepository extends JpaRepository<Story, Integer>{

}
