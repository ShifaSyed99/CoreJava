package com.edubridge.assigment;

import java.util.Scanner;

public class HomeworkSearch {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		
		int flag = 0 ; //default value is 0 ie false
		System.out.println("Enter number of values:");
		int n = s.nextInt();
		
		System.out.println("Enter the values:");
		int arr[] = new int[n];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = s.nextInt();
		}
		
		System.out.println("Enter the number to find:");
		int a = s.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			if(arr[i] == a)
				flag = 1;
		}
		if(flag == 1)
			System.out.println("The number "+a+ " found in array");
		else
			System.out.println("The number "+a+ " not found in array");
		s.close();
	}

}
