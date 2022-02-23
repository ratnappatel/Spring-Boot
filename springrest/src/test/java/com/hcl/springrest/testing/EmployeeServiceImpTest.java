package com.hcl.springrest.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.springrest.dto.EmployeeDTO;
import com.hcl.springrest.entity.Employee;
import com.hcl.springrest.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmployeeServiceImpTest {
	
	
	@Autowired
	IEmployeeService service;
	

	@Test
	@DisplayName("AddEmployee")
	void testAddEmployee() {
		
		EmployeeDTO emp = new EmployeeDTO();
		
		emp.setName("pravalika");
		emp.setSalary(50000);
	
	Employee e1 =	service.addEmployee(emp);
		
			assertNotNull(e1);
			
			log.debug("AddEmployee Test executed... debug");
			
			log.info("This is EmpService info");
			
			
	}

	@Test
	void testGetEmployeeById() {
		
		
		Employee emp =		service.getEmployeeById(101);
		
		assertEquals(99000, emp.getSalary());
		
	}

}
