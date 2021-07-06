package com.example.eurekanamingclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaNamingClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingClient1Application.class, args);
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "From Eureka Naming Client1";
	}

}
