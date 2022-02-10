package com.gl.basic.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Called a main SpringBootApplication class
@SpringBootApplication//[@EnableAutoConfiguration+@ComponentScan]
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
