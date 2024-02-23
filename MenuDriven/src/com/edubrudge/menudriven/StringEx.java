package com.edubrudge.menudriven;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		
		System.out.println("Welcome to String methods system.");
		
		Scanner s = new Scanner(System.in);
		
		int choice = 0;
		
		System.out.println("Enter first string : ");
		String s1 = s.next();
		
		System.out.println("Enter second string : ");
		String s2 = s.next();
		
		
		do
		{
			System.out.println("1. Length will be checked :");
			System.out.println("2. Concatenation will be done :");
			System.out.println("3. Comparation will be done :");
			System.out.println("4. Exit.");
			
			choice = s.nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println();
				System.out.println("First string length is : "+s1.length());
				System.out.println("Second string length is : "+s2.length());
			break;
			
			case 2 :
				System.out.println();
				
				System.out.println("String concatenation is : "+s1.concat(s2));
			break;
			
			case 3 :
				System.out.println();
				
				System.out.println("Compare  : "+s1.compareTo(s2));
			break;	
			
			case 4:
				System.out.println("Exit.");
			break;
			
			default:
				System.out.println("Wrong Input.");
			break;
			
			}
			
		} while (choice!= 4);

	}

}
