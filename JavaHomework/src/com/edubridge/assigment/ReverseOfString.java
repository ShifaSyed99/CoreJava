package com.edubridge.assigment;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String s1 = s.next();
		
		char [] c = s1.toCharArray();
		String rev = "";
		
		for(int i = s1.length()-1 ; i>=0 ; i--)
		{
			rev = rev + c[i];
		}
		System.out.println(rev);
		s.close();
	}

}
