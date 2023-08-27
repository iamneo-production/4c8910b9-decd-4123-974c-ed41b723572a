package com.isp.storymanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isp.storymanagementapi.entities.Characters;

public interface CharactersRepository extends JpaRepository<Characters, Integer>{

}
