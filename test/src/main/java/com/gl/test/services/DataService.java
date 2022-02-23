package com.gl.test.services;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
	
	public int[] getAll() {
		return new int[] {12,23,34,45,56,67,78,89};
	}

}
