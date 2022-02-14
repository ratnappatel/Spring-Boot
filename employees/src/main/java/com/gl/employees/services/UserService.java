package com.gl.employees.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.employees.entities.User;
import com.gl.employees.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	UserRepository repository;
	
	public User authenticate(User user)
	{
		User exists=repository.findByIdAndPassword(user.getId(),user.getPassword());
		if(user!=null)
			return exists;
		else
			return null;
	}

}
