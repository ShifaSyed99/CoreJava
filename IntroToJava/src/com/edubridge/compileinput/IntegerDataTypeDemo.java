package com.edubridge.compileinput;

import java.util.Scanner;

public class IntegerDataTypeDemo {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		byte num1 = a.nextByte();
		System.out.println("The byte num value is:"+num1);
		
		short num2 = a.nextShort();
		System.out.println("The short num value is:"+num2);
		
		int num3 = a.nextInt();
		System.out.println("The int num value is:"+num3);
		
		long num4 = a.nextLong();
		System.out.println("The long num value is:"+num4);
		a.close();
	}

}
