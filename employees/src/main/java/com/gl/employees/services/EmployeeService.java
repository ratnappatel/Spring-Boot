package com.gl.employees.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.employees.entities.Employee;
import com.gl.employees.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> emps=repository.findAll();
		emps.sort((e1,e2)->e1.getSalary()-e2.getSalary());
		return emps;
	}

}
