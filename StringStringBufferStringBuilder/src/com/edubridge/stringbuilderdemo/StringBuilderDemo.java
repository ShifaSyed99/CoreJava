package com.edubridge.stringbuilderdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		 
		StringBuilder a = new StringBuilder("");
		System.out.println(a.capacity());
		
		StringBuilder b = new StringBuilder("Shifa");
		System.out.println(b.capacity());
		
		StringBuilder c = new StringBuilder("Syed Shifa Masroor Ahmed is Learning Java Full Stack");
		System.out.println(c.capacity());
		
		System.out.println(b.append(" Syed"));

	}

}
