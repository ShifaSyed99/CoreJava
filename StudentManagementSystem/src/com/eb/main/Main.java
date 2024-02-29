package com.eb.main;

import java.util.Scanner;

import com.eb.dao.StudentDao;
import com.eb.pojo.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String n = s.next();
		
		System.out.println("Welcome to the student data management : "+n);
		
		int ch = 0;
		do
		{
			System.out.println("Press 1 to Add Student.");
			System.out.println("Press 2 to Update Student.");
			System.out.println("Press 3 to Delete Student.");
			System.out.println("Press 4 to Read Student Records.");
			System.out.println("Press 5 to Exit.");
			System.out.println("Enter your choice.");
			ch = s.nextInt();
			
			switch(ch)
			{
			case 1 :
				System.out.println("Enter Student Name: ");
				String name = s.next();
				
				System.out.println("Enter Student Phone Number: ");
				String phone = s.next();
				
				System.out.println("Enter Student City: ");
				String city = s.next();
				
				Student st = new Student(name, phone, city);
				boolean ans = StudentDao.insertStudentData(st);
				
				System.out.println("Data Inserted Successfully.");
			break;
			
			case 2 :
				System.out.println("Press 1 to Update Name : ");
				System.out.println("Press 2 to Update Phone Number : ");
				System.out.println("Press 3 to Update City : ");
				int val = s.nextInt();
				
				if(val == 1)
				{
					System.out.println("Enter the Name you want to update : ");
					String name1 = s.next();
					
					System.out.println("Enter Id : ");
					int id = s.nextInt();
					
					Student s1 = new Student();
					s1.setStudentName(name1);
					
					boolean f = StudentDao.updateStudentData(val, name1, id, s1);
					System.out.println("Name Data Updated Successfully.");		
				}
				
				else if(val == 2)
				{
					System.out.println("Enter the Phone Number you want to update : ");
					String pno = s.next();
					
					System.out.println("Enter Id : ");
					int id = s.nextInt();
					
					Student s1 = new Student();
					s1.setStudentName(pno);
					
					boolean f = StudentDao.updateStudentData(val, pno, id, s1);
					System.out.println("Phone Data Updated Successfully.");		
				}
				
				else if(val == 3)
				{
					System.out.println("Enter the City you want to update : ");
					String city1 = s.next();
					
					System.out.println("Enter Id : ");
					int id = s.nextInt();
					
					Student s1 = new Student();
					s1.setStudentName(city1);
					
					boolean f = StudentDao.updateStudentData(val, city1, id, s1);
					System.out.println("City Data Updated Successfully.");	
				}
				
				else
				{
					System.out.println("Data is Not Updated.");
				}
			break;
			
			case 3:
				System.out.println("Enter ID you want to Delete: ");
				
				int id = s.nextInt();
				
				StudentDao.deleteStudentData(id);
				
				System.out.println("ID is deleted.");
			break;
			
			case 4:
				StudentDao.showAllStudentData();
			break;
			
			case 5:
				System.out.println("Bye Bye.");
			break;
			
			default:
				System.out.println("Wrong Choice!");
			}
			
			
		}
		while(ch!= 5);
			{
			
			}

	}

}
