package com.edubridge.compiletimearray;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//int n = s.nextInt();
		
		//declaration for outside jagged array 
		int a[][] = new int [2][];
		a[0] = new int[3];
		a[1] = new int[2];
		
		
		for(int i=0 ; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		
		for(int i=0 ; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
