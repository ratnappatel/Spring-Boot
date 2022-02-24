package com.gl.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.gl.test.services.BusinessService;
import com.gl.test.services.DataService;

@RunWith(MockitoJUnitRunner.class) //causes all initialization to take place with other annotation like @Mock @InjectMock

public class BusinessServiceMockTest {
	
	@Mock // create a mock for DataService
	DataService dataServiceMock;
	
	@InjectMocks  // Inject mocks as dependencies into business obj
	BusinessService businessObj;
	
	
	@Test // TestCase 1 : having 3-elements in array
	public void testFindTheMax_3Elements() {
		when(dataServiceMock.getAll()).thenReturn(new int[] {36,84,97});
		assertEquals(97,businessObj.findTheMax());
	}
	
	@Test // TestCase 1 : having 3-elements in array
	public void testFindTheMax_NegativeElement() {
		when(dataServiceMock.getAll()).thenReturn(new int[] {-36,-84,-97,-123});
		assertEquals(-36,businessObj.findTheMax());
	}
	
	
	@Test // TestCase 1 : having 3-elements in array
	public void testFindTheMax_1Elements() {
		when(dataServiceMock.getAll()).thenReturn(new int[] {36});
		assertEquals(36,businessObj.findTheMax());
	}
	
	

}
