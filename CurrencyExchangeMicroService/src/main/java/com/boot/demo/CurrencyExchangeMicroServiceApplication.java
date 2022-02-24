package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyExchangeMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeMicroServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate template()
	{
		return new RestTemplate();
	}
}
