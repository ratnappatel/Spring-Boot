package com.gl.test.services;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {
	
	private DataService dataService;
	
	public BusinessService(DataService dataService) {
		// TODO Auto-generated constructor stub
		this.dataService=dataService;
	}
	public int findTheMax()
	{
		int data[]=dataService.getAll();
		int max=Integer.MIN_VALUE;
		for(int x:data)
		{
			if(x>max)
				max=x;
		}
		return max;
	}

}
