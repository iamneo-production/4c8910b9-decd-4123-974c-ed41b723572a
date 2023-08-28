package com.isp.progresstrackingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProgressTrackingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgressTrackingApiApplication.class, args);
	}

}
