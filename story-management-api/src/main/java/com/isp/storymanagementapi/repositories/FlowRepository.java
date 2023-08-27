package com.isp.storymanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isp.storymanagementapi.entities.Flows;

public interface FlowRepository extends JpaRepository<Flows, Integer>{

}
