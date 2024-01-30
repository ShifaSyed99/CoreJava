package com.edubridge.looingstatement;

import java.util.Scanner;

public class QuestionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any numbers: ");
		int n=s.nextInt();
		
		int count=0;
		while (n!=0)
		{ 
			count++;
			n=n/10;
			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         

		}
		System.out.print(count); 
		s.close();
	}

}
