package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ForexMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexMicroServiceApplication.class, args);
	}

}
