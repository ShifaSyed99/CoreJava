package com.edubridge.selectionstatement;
import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if (a!=b)
			System.out.println("a is not equal to b");
		else 
			System.out.println("a is equal to b");
	}

}
 