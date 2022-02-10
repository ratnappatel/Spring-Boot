package com.gl.basic.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// This class is used to Map every URI to a method
	@RequestMapping("/")
	public String hello()
	{
		return "Hi ! Welcome to the world of Spring Boot Application Development..";
	}

}
