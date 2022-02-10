package com.gl.student.controller;

import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gl.student.model.Student;
import com.gl.student.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String displayAll(Model m)
	{
		System.out.println("In display All");
		TreeMap<Integer,Student> students=studentService.getStudents();
		System.out.println("retrieved students from dao");
		m.addAttribute("students", students);
		System.out.println("added model attribute.");
		return "list";
		
	}
}
