package com.gl.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.employees.entities.Employee;
import com.gl.employees.entities.User;
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
	public ModelAndView addEmployeeForm()
	{
		ModelAndView mv=new ModelAndView("addEmployeeForm");
		Employee e=new Employee();
		mv.addObject("e",e);
		return mv;
	}
	
	@PostMapping("/add")
	public ModelAndView addEmployee(@ModelAttribute Employee e)
	{
		ModelAndView mv=new ModelAndView();
		Employee emp=service.addEmployee(e);
		if(emp!=null)
		{
				mv.setViewName("addEmployee");
				mv.addObject("emp", emp);
		}
		else
			mv.setViewName("error");
		return mv;
	}

}
