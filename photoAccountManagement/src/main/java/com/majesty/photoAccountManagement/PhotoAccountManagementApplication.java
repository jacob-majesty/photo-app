package com.majesty.photoAccountManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAccountManagementApplication.class, args);
	}

}
