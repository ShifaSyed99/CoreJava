package com.edubridge.assigment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int a=0 , b=1, c;
		 System.out.print(a+" "+b+" ");
		 for(int i=3; i<=n; i++) //first 2 index a and b are initialised already so i=3
		 {
			 c = a+b;
			 a = b;
			 b = c;
			 System.out.print(c+" ");
		 }
		

	}

}
