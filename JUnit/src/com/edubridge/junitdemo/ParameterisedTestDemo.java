package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterisedTestDemo {
		
		//@Test
		@ParameterizedTest
		@ValueSource(strings = {"shifa" , "sakshi"})
		void disp(String word)
		{
			System.out.println(word);
		}
		
		@ParameterizedTest
		@ValueSource(ints = {1, 2})
		void acc(int word)
		{
			System.out.println(word);
		}

}
