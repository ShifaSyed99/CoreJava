package com.edubridge.assigment;

import java.util.Scanner;

public class FeeCollection {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		int tf = s.nextInt();
		int bf = s.nextInt();
		int hf = s.nextInt();
		
		double a = (tf+bf);
		double b = tf+hf;
		
		double c = (((tf/100)*150)+ bf);
		double d = (((tf/100)*150)+ hf);
		
		switch(str)
		{
		case "MSF" :
			System.out.printf("%.2f",a);
			break;
		
		case "MSH" :
			System.out.printf("%.2f",d);
			break;
			
		case "MGSDS" :
			System.out.printf("%.2f",tf);
			break;
		
		case "MGSh" :
			System.out.printf("%.2f",hf);
			break;	
			
		default :
			System.out.println("Invalid");
		}	
	}

}
