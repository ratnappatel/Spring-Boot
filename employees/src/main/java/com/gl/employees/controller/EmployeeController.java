package com.gl.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.employees.entities.Employee;
import com.gl.employees.services.EmployeeService;

@RestController
//@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/list")
	public List<Employee> getEmployees()
	{
		return service.getAllEmployee();
	}

}
