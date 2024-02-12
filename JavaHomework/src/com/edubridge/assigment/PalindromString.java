package com.edubridge.assigment;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		

			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			
			String str1 = s.nextLine();
			
			char c[] = str1.toCharArray();
			
			String str2 = "";
			
			for(int i = str1.length()-1; i>=0; i--)
			{
				str2 = str2 + c[i];
			}
				if(str1.equals(str2)) //not == since it compares whether the 
									//two strings points/refer to same object
				{
					System.out.println("The string entered is a Palindrome");
				}
				else
				{
					System.out.println("The string entered is not a Palindrome");
				}
				s.close();
			}
	
	}
/*
 * */

