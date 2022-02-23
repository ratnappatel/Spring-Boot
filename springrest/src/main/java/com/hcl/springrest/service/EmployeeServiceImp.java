package com.hcl.springrest.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.springrest.dto.EmployeeDTO;
import com.hcl.springrest.entity.Employee;
import com.hcl.springrest.repository.IEmployeeRepository;



@Service
public class EmployeeServiceImp implements IEmployeeService {

		Logger log = Logger.getLogger(EmployeeServiceImp.class);
	
	@Autowired
	IEmployeeRepository repo; // dao

	@Override
	public Employee addEmployee(EmployeeDTO empdto) {

		Employee emp = new Employee(); // entity obj
		emp.setName(empdto.getName());
		emp.setSalary(empdto.getSalary());
		
		log.info("EmployeeServiceImp executed..");

		return repo.save(emp);
	}

	@Override
	public Employee getEmployeeById(int id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return (List<Employee>) repo.findAll();
	}

	@Override
	public Employee updateEmployee(EmployeeDTO dto) {
		
		
		Employee emp = new Employee(dto.getId(),dto.getName(),dto.getSalary()); // entity obj
		

		return repo.save(emp);
	}

	@Override
	public void deleteEmployeeById(int id) {

		repo.deleteById(id);
	}

}
