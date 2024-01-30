package com.edubridge.assigment;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of values");
		int m = s.nextInt();
		int n = 2*m;
		
		for(int i=1; i<=n; i=i+2)
		{
			for(int j=i; j<=n; j=j+2)
			{
				System.out.print(j+" ");
				//j++;
				
			}
			//i++;
			System.out.println();
		}
		
		s.close();

	}

}
