package com.crud.main;

import java.util.Scanner;

import com.crud.dao.EmployeeDao;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeDao emp = new EmployeeDao();
		
		int ch = 0;
		
		do {
			System.out.println("Welcome to Hibernate CRUD Demo...");
			System.out.println("Press 1 for Insert Data");
			System.out.println("Press 2 for Show Data");
			System.out.println("Press 3 for Update Data");
			System.out.println("Press 4 for Delete Data");
			System.out.println("Press 5 for Exit");
			
			System.out.println("Enter your choice:");
			switch(ch)
			{
			case 1 :
				System.out.println("Enter Employee First Name :");
				String fname = sc.next(); 
				
				System.out.println("Enter Employee Last Name :");
				String lname = sc.next();
				
				System.out.println("Enter Employee Salary :");
				int salary = sc.nextInt();
				
				emp.addEmployee(fname, lname, salary);
				
				System.out.println("Data Inserted Successfully.");
			break;
			
			case 2 :
				emp.getEmployeelist().forEach(u -> System.out.println(u));
			break;
			
			case 3 :
				
			break;
				
			case 4 :
				
			break;
				
			case 5 :
				
			break;	
			}
		}
		while(ch!= 5);

	}

}
