package com.edubridge.assigment;

import java.util.Scanner;

public class FloatInput {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		
		float num1 = a.nextFloat();
		System.out.printf("Value is: %.2f ",num1);
		
		float num2 = a.nextFloat();
		System.out.printf(" Value is : %.2f ",num2);
		
		a.close();

	}

}
