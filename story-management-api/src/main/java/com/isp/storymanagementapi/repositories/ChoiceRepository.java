package com.isp.storymanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isp.storymanagementapi.entities.Choice;

public interface ChoiceRepository extends JpaRepository<Choice, Integer>{

}
