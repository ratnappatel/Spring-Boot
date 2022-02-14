package com.gl.employees.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.employees.entities.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer>
{

	
}
