package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleJUnitTestDemo {
	//@Test ensures that to perform unit testing on given block of code.
	
		@Test
		//@DisplayName is used to show a new name of method
		@DisplayName("displayOutput")
		void test() {
			
			int a =10 , b = 5;
			
			System.out.println("Addition is:"+(a+b));
		}

}
