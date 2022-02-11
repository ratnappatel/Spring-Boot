package com.gl.student.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gl.student.model.Student;
import com.gl.student.service.StudentService;

// marks a java class as MVC Controller class

@Controller
public class StudentController {

	
	  @Autowired StudentService service;
	 
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String displayAll(Model m)
	{
		System.out.println("In display All");
		ArrayList<Student> students=service.getAll();
		m.addAttribute("students", students);
		return "list";
		
	}
}
