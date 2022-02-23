package com.hcl.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.springrest.dto.EmployeeDTO;
import com.hcl.springrest.entity.Employee;
import com.hcl.springrest.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1/employee")
public class EmployeeRestController {

		//@RequestMapping(value="/add",method = RequestMethod.GET)
	
		@Autowired
		IEmployeeService service;
		
		@PostMapping("/add")
		public Employee  addEmployee(@RequestBody EmployeeDTO emp ) {
			
			
			
			log.info("Controller executed.");
				
	return	service.addEmployee(emp);
			
			
		}
		
		@PutMapping("/update")
		public Employee  updateEmployee(@RequestBody EmployeeDTO emp ) {
			
			return   service.updateEmployee(emp);
			
		}
		
		
		
		@GetMapping("/get/{id}")
		public  Employee  getEmployeeById(@PathVariable int id) {
			
			
			
			
			return  service.getEmployeeById(id);
			
			
		}
		
		
		
		@DeleteMapping("/remove/{id}")
		public String  remove(@PathVariable int id) {
			
		service.deleteEmployeeById(id);
		
			return "Record deleted...";
			
		}
		
		
		@GetMapping("/getall")
		public List<Employee> getAll(){
			
			
			return service.getAllEmployees();
			
		}
		
		
		
		
	
	
}
