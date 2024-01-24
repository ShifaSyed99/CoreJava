package com.edubridge.runtime;

import java.util.Scanner;

public class RunTimeArray {

	public static void main(String[] args) {
//Single Dimension Array		
		Scanner s = new Scanner(System.in);
	/*	int n = s.nextInt();
		
		//array declaration
		int a[] = new int[n];
		
		//array initialization
		for(int i1=0; i1<n; i1++)
		{
			a[i1] = s.nextInt();
		}
		System.out.println("Array elements are:");
		
		//to print an array
		
		for(int i1=0; i1<n; i1++)
		{
		
		System.out.print(a[i1]+" ");
		}*/
		
//Multi Dimension Array
		
		int x = s.nextInt();
		int y = s.nextInt();
		
//Array declaration
		
	int b[][] = new int[x][y];
	
//store array
	
	for(int i2=0 ; i2<x ; i2++)
	{
		for(int j2=0 ; j2<y; j2++)
		{
			b[i2][j2] = s.nextInt();
		}
	}
		

//print array
	
		for(int i2=0 ; i2<x ; i2++)
		{
			for(int j2=0 ; j2<y; j2++)
			{
				System.out.print(b[i2][j2]+" ");
			}
			System.out.println();
		}

	s.close();

	}

}
