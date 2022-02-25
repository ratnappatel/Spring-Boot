package com.gl.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gl.author.config.JwtTokenUtil;
import com.gl.author.model.JwtRequest;
import com.gl.author.model.JwtResponse;
import com.gl.author.model.UserDetails;
import com.gl.author.services.UserService;

@RestController
public class AuthenticationController {
	
	@Autowired 
	UserService service;
	
	@Autowired
	JwtTokenUtil jwtUtil;
	
	@Autowired 
	AuthenticationManager authenticationManager;
	
	
	//While user logs in he/she provides username+password as data
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ResponseEntity<?> createJwtToken(@RequestBody JwtRequest credentials)throws Exception
	{
		final String token;
		
		UserDetails user=service.getUser(credentials.getUsername(),credentials.getPassword());
		if(user!=null) {
			token=jwtUtil.generateToken(user);
			return ResponseEntity.ok(new JwtResponse(token));
		}
		else
		{
			return (ResponseEntity<?>) ResponseEntity.notFound();
		}
	}

}
