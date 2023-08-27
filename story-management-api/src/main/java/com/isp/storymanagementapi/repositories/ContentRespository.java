package com.isp.storymanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isp.storymanagementapi.entities.Content;

public interface ContentRespository extends JpaRepository<Content, Integer>{

}
