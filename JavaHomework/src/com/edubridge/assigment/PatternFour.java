package com.edubridge.assigment;

import java.util.Scanner;

public class PatternFour {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of values in the series:");
		
		float f = 0.5f;
		
		float a = 1;
		
		int n = s.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			f = f * 3;
			System.out.println(f);
		}
		s.close();
	}

}
