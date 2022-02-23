package com.hcl.springrest.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.hcl.springrest.dto.EmployeeDTO;
import com.hcl.springrest.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmployeeRestControllerTest {

		@Autowired
		EmployeeDTO empDTO;
		
		@Autowired
		RestTemplate restTemplate;
	
	
	@Test
	void testUpdateEmployee() {
		
		
		
		empDTO.setId(101);
		empDTO.setName("TOM JERRY");
		empDTO.setSalary(65000);
		
		
		restTemplate.put("http://localhost:8585/v1/employee/update", empDTO);
		
		
	Employee employee =	restTemplate.getForObject("http://localhost:8585/v1/employee/get/"+empDTO.getId(), Employee.class);
		
			assertEquals(65000, employee.getSalary());
	
	}

	@Test
	void testRemove() {
		
		
				//restTemplate.delete("http://localhost:8585/v1/employee/remove/"+30);
				
	//Employee employee =	restTemplate.getForObject("http://localhost:8585/v1/employee/get/"+30, Employee.class);
	
	//	assertNull(employee);
	
		
	
	}

	@Test
	void testGetAll() {
		
		List<Employee> list =	restTemplate.getForObject("http://localhost:8585/v1/employee/getall/", List.class);
		
		assertEquals(6, list.size());
		
	}

}
