package com.edubridge.compileinput;

import java.util.Scanner;

public class BooleanAndStringDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String b = s.nextLine();  //nextLine() for more than one string
		System.out.println(b);
		
		char c = s.next().charAt(0);
		System.out.println(c);
		
		boolean a = s.nextBoolean();
		System.out.println(a);
		
		
		s.close();

	}

}
