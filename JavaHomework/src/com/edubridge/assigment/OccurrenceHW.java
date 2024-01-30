package com.edubridge.assigment;

import java.util.Scanner;

public class OccurrenceHW {

	public static void main(String[] args) {

		Scanner  s = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String s1 = s.nextLine();
		
		/*System.out.println("Enter the letter to remove:");
		String s2 = s.next();*/
		
		s1 = s1.replaceAll("the", " ");
		
		System.out.println(s1);

		s.close();
	}

}
