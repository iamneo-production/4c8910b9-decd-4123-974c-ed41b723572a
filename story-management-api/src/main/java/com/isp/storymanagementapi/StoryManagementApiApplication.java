package com.isp.storymanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication

public class StoryManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoryManagementApiApplication.class, args);
	}

}
