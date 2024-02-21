package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestCaseDemo {

	//@Test
	//@RepeatedTest(n) is used to perform the block n times 
	@RepeatedTest(2)
	void test() {
		for(int i = 1; i <= 2; i++)
			//for loop 3 times then repeated test case 2 times ie 2*2=4
			System.out.println("Hi");
		
	}

}
