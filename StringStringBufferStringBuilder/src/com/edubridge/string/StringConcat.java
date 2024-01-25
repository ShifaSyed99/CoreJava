package com.edubridge.string;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		
		Scanner  s = new Scanner(System.in);
		
		String s1 = s.next();
		String s2 = new String(s.next());
		
		System.out.println(s1.concat(s2));
		System.out.println(20+50+"Hello"+10+10);
		System.out.println(20+50+"Hello"+10+10+"User"+10+10);

		
		s.close();
	}

}
