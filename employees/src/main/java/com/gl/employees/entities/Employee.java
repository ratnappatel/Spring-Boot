package com.gl.employees.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int salary;
	
	@Column(name = "DEPT_NO")
	private int departmentNo;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, int salary, int departmentNo) {
		this.name = name;
		this.salary = salary;
		this.departmentNo = departmentNo;
	}
}
