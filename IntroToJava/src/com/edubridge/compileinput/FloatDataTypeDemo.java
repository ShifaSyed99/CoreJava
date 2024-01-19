package com.edubridge.compileinput;

import java.util.Scanner;

public class FloatDataTypeDemo {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		float num1 = a.nextFloat();
		System.out.println("The float num value is:"+num1);
		
		double num2 = a.nextDouble();
		System.out.println("The double num value is:"+num2);
		
		a.close();

	}

}
