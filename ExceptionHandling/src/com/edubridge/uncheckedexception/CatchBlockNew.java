package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class CatchBlockNew {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = 45;
		System.out.println("enter second value");
		int y = s.nextInt();
		
		int a[] = {1, 2, 3};
		try
		{
			System.out.println(x/y);
			try
			{
				System.out.println(a[3]);
			}
		
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
			{
				if(e instanceof ArithmeticException)
					System.out.println(e);
				else
					System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Always Executed.");
		}
		
		s.close();
	}

}
