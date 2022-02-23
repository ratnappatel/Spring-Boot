package com.hcl.springrest.dto;



import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Component
public class EmployeeDTO {
	
	
	private int id;
	private String name;
	private  double salary;
	
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	
}

