package com.edubridge.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MockitoWithJUnitDemo {
	
	//dependency injection in he form of objects
	private Calculator c;
	//for checking condition in the main testing class using mock method
	
	@BeforeEach
	void setDemo()
	{
		c = mock(Calculator.class);
		when(c.add(1, 1)).thenReturn(2);
		when(c.sub(2, 2)).thenReturn(0);
	}
	
	@Test
	void testadd() 
	{
		Assertions.assertEquals(2 , c.add(1, 1));
		verify(c).add(1, 1);
	}

	@Test
	void testsub() 
	{
		Assertions.assertEquals(0 , c.sub(2, 2));
		verify(c).sub(2, 2);
	}
}
