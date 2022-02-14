package com.gl.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.employees.entities.Employee;
import com.gl.employees.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/list")
	public ModelAndView getEmployees()
	{
		ModelAndView mv=new ModelAndView("list");
		List<Employee> emps=service.getAllEmployee();
		mv.addObject("emps",emps);
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView addEmployee()
	{
		ModelAndView mv=new ModelAndView("addEmployee");
		Employee e=new Employee();
		mv.addObject("e",e);
		return mv;
	}

}
