package com.gl.authentication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	
	@GetMapping(path="/",produces="application/json")
	public List<String> getList() 
	{
		List<String> msgs=new ArrayList<String>();
		msgs.add("A");
		msgs.add("B");
		msgs.add("C");
		msgs.add("D");
		return msgs;
	}
	

}
