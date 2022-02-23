package com.hcl.springrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.springrest.entity.Employee;


@Repository //optional
public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}
