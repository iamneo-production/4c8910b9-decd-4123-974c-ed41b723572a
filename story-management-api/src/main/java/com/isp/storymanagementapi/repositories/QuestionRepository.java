package com.isp.storymanagementapi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isp.storymanagementapi.entities.Content;
import com.isp.storymanagementapi.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

	public Question findByContentId(Optional<Content> optional);

	
}
