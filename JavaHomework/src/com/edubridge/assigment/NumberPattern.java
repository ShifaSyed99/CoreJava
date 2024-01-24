package com.edubridge.assigment;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = 1;   //new number for new line
		
		for(int i=1; i<=m; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(n+" "); //print the value of n
				n++;    //increment the value of n
			}
			System.out.println();
		}

		s.close();
	}

}
