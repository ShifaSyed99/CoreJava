package com.edubridge.compiletimearray;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		//Single Dimension Array		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		//array declaration
		int a[] = new int[n];
		
		//array initialization
		for(int i=0; i<a.length; i++)
		{
			a[i] = s.nextInt();
		}
		//System.out.println("Array elements are:");
		

		
		//to print an array
		int max=a[0];    //int max = 0
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)      //if(a[i]< a[i+1])
				{
				 max = a[i];              //max = a[i+1];
				}
		}	
			//else
				// max = a[i];
   System.out.println(max);
		//System.out.print(a[i]+" ");
		
		
		
		
		//to print an array
		
		/*for(int i=0; i<=n; i++)
		{
				
			System.out.print(a[i]+" ");
		}*/
		s.close();
	}

}
