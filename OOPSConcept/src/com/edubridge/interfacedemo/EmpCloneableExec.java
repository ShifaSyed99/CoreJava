package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmpCloneableExec {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the employee ID: ");
		int empid = s.nextInt();
		
		System.out.println("Enter the employee Name: ");
		String empn = s.next();
		
		System.out.println("Enter the employee Salary: ");
		long sal = s.nextLong();
		
		Employee e1 = new Employee(empid, empn, sal);
		//override a clone method inside an implementable class to use here
		Employee e2 = (Employee)e1.clone();
		
		e2.disp();
		
	}

}
