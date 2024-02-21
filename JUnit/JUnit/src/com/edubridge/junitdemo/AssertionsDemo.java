package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionsDemo {

	@Test
	@DisplayName("AssertTrue")
	void testOne() {
		//if expression true it passes else fails
		assertTrue(13 >= 6);
	}
	
	@Test
	@DisplayName("AssertFalse")
	void testTwo() {
		//if expression false it passes else fails
		assertFalse(13 <= 6);
	}

	@Test
	@DisplayName("AssertEquals")
	void testThree() {
		//if values in expression are equal it passes else fails
		assertEquals(13, 6);
	}
	
	@Test
	@DisplayName("AssertNotNull")
	void testFour() {
		//if values in expression is null it passes else fails
		assertNotNull("");
	}
}
