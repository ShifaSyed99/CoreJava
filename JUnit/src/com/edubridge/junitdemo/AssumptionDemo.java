package com.edubridge.junitdemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
		System.setProperty("shifa", "shifa");
		//when it is true it will pass as well as execute
		//and it is false it will skip as well as execute
		Assumptions.assumeTrue("shifa".equals(System.getProperty("shifa")));
		//it will skip
		}
	
	@Test
	void test1()
	{
		System.setProperty("shifa", "shifa");
		Assumptions.assumeFalse("shifa".equals(System.getProperty("shifa")));
		
	}
	
	@Test
	void test2()
	{
		int x= 10, y= 20;
		
		//i will pass and execute whether its true or false
		Assumptions.assumingThat(x == y, () -> {
			System.out.println("Assuming that...");
			});
		System.out.println("This method will run");
		
	}

}
