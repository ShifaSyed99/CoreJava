package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int x = 15;
		
		System.out.println("Enter the second value: ");
		int y = s.nextInt();
		
		try
		{
			System.out.println(x/y);
			//when we use System.exit(0); inside a try block when an exception is thrown also inside a catch block 
			//after a printing statement then finally block is not executed
			//System.exit(0);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occurred: "+e);
			//System.exit(0);
		}
		finally
		{
			//when we use System.exit(0); inside a finally block and when an exception is thrown inside a finally block 
			//before a printing statement then finally block is not executed
			//System.exit(0);
			System.out.println("Finally Block.");
		}
		s.close();
	}

}
