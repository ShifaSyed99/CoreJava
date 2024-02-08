package com.edubridge.abstractiondemo;

import java.util.Scanner;

public class Executor {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		ISRO i = new ISRO();
		
		System.out.println(i.display());
		i.disp();
		i.setAgencyn("ISRO");
		i.setBudget(567890);
		
		System.out.println("Enter input: ");
		i.disp(s.next(), s.nextLong());
	}

}
