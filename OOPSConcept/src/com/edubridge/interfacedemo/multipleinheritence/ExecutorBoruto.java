package com.edubridge.interfacedemo.multipleinheritence;

import java.util.Scanner;

public class ExecutorBoruto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Boruto b = new Boruto();
		
		System.out.println("Enter values: ");
		
		int nochildren = s.nextInt();
		String position = s.next();
		String clan = s.next();
		
		b.powerOne(nochildren, position);
		b.powerTwo(nochildren, clan);

		s.close();
	}

}
