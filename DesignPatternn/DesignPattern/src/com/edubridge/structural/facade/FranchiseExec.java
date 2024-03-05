package com.edubridge.structural.facade;

import java.util.Scanner;

public class FranchiseExec {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Registration System!");
		
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		do
		{
			System.out.println("Press 1 to access KFC.");
			System.out.println("Press 2 to access McD.");
			System.out.println("Press 3 to access Dominos.");
			System.out.println("Press 4 to Exit.");
			System.out.println("Enter your choice.");
			ch = sc.nextInt();
			
			FranchiseRegistration f = new FranchiseRegistration();
			
			switch(ch)
			{
			case 1 :
				f.BuyKFC();
			break;
			
			case 2 :
				f.BuyMcD();
			break;
			
			case 3 :
				f.BuyDominos();
			break;
			
			case 4:
				System.out.println("Exiting.");
			break;
			
			default :
				System.out.println("Wrong Choice!!"+" \tAccess Denied!! ");
			}	

	}while(ch!= 4);

}
}	
