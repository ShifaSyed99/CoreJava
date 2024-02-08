package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class MultipleTryAndCatch {
	
	public static void disp(int a[])
	{
		try
		{
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurred: "+e);
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = 45;
		
		System.out.println("Enter second value: ");
		int y = s.nextInt();
		try
		{
			System.out.println(x/y);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurred: "+e);
		}
		int a[] = {1, 2, 3};
		
		MultipleTryAndCatch.disp(a);
		s.close();
	}
	
}
