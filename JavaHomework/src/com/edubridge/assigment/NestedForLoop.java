package com.edubridge.assigment;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"); //print i for only 1 in the pattern sysout(i);
			}
			System.out.println();
		}

		s.close();
	}

}
