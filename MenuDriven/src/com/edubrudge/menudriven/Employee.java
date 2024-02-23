package com.edubrudge.menudriven;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Management System.");
		
		int choice = 0;
		
		do
		{
			System.out.println("1. Employee has to enter name :");
			System.out.println("2. Employee has to enter designation :");
			System.out.println("3. Employee has to enter speciality :");
			System.out.println("4. Exit.");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println();
				String name = s.next();
				System.out.println("Employee name is : "+name);
			break;
			
			case 2 :
				System.out.println();
				String des = s.next();
				System.out.println("Employee designation is : "+des);
			break;
			
			case 3 :
				System.out.println();
				String sp = s.next();
				System.out.println("Employee specialization is : "+sp);
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
