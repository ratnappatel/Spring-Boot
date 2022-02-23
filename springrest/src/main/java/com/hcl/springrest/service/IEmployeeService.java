package com.hcl.springrest.service;

import java.util.List;

import com.hcl.springrest.dto.EmployeeDTO;
import com.hcl.springrest.entity.Employee;

public interface IEmployeeService {
	
	
	
		public Employee addEmployee(EmployeeDTO empdto);
	
		public  Employee  getEmployeeById(int id);
		
		public  List<Employee>  getAllEmployees();
		
		
		public Employee  updateEmployee(EmployeeDTO emp);
		
		public  void  deleteEmployeeById(int id);
			
		
	

}
