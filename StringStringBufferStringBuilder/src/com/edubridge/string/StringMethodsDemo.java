package com.edubridge.string;

import java.util.Arrays;


public class StringMethodsDemo {

	public static void main(String[] args) {

		String s1 = "Nia Sharma";    //total 10 chars
		String s2 = "";
		//String s3 = "abc";
		System.out.println(s1.length());
		
		char []a = new char[10];  //since index 0-9 so 10 as next index of last char
		
		//convert to char array of chars
		s1.getChars(0, 10, a, 0);
		System.out.println(Arrays.toString(a));
		//System.out.println(s1.toCharArray());
		
		
		//compare and ignore
		System.out.println(s1.compareTo("nia shaRma"));		//will compare the ASCII value
		System.out.println(s1.compareTo("Nia Sharma"));
		System.out.println(s1.compareToIgnoreCase("nia shaRma"));
		
		System.out.println(s2.isEmpty());
		//System.out.println(s2.isBlank());
		
		System.out.println(s1.charAt(2));
		
		System.out.println("Hello World".startsWith("He"));
		System.out.println("Hello World".endsWith("rld"));
		System.out.println("Hello World".endsWith("ol"));
		
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println("   The Cat Is Sleeping  ");  //removes pre post spaces from string
		System.out.println("   The Cat Is Sleeping  ".trim());
		
		
		//System.out.println("   The Cat Is Sleeping  ".strip());
		
		//System.out.println(s1.repeat(2));

	}

}
