package com.gl.employees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.employees.entities.User;
import com.gl.employees.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/login")
	public ModelAndView loginForm()
	{
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("user",new User());
		return mv;
	}
	
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute User user)
	{
		ModelAndView mv=new ModelAndView();
		String page="";
		String result=service.authenticate(user);
		if(result.equals("success"))
			mv.setViewName("list");
		else
			mv.setViewName("error");
		return mv;
	}

}
