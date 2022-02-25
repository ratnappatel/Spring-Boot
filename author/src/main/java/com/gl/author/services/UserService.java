package com.gl.author.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.author.model.UserDetails;
import com.gl.author.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	public UserDetails getUser(String username,String password)
	{
		return repository.findByUsernameAndPassword(username,password);
	}
	public UserDetails findByUserName(String username)
	{
		return repository.findByUsername(username);
	}

}
