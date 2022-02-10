package com.gl.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gl.login.model.User;

@Controller
public class LoginController {
	
	// A Function will render login form when request uri is /
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String begin(Model model) {
		model.addAttribute("msg","Please Enter Your Login Details");
		return "login";		
	}
	
	// A Function will read input from login form and test
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String login(Model model,@ModelAttribute("user")User user)
	{
		if(user.getUserName().equalsIgnoreCase("Ghanshyam") && user.getPassword().equals("123"))
		{
			model.addAttribute("msg",user.getUserName());
			return "success";
		}
		else
		{
				model.addAttribute("error","Invalid Details");
				return "login";
		}		
	}

}
