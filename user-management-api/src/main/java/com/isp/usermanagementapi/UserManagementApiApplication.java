package com.isp.usermanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class UserManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApiApplication.class, args);
	}

}
