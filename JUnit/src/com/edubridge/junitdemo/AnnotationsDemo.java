package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AnnotationsDemo {


	@Test
	void test() {
		System.out.println("Test method");
	}
	
	//@BeforeEach will be executed before each method
	@BeforeEach
	void accept()  {
		System.out.println("Before each method");
	}
	
	//@AfterAll will be execute after ALL the methods are executed
	@AfterAll 						//method always static
	static void play() {
		System.out.println("Play method");
	}

	@Test
	void disp() {
		System.out.println("Display method");
	}
	
	@Test
	//@Disabled will disable the method and not execute it
	@Disabled
	void disable() {
		System.out.println("Disabled method");
	}

}
