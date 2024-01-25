package com.edubridge.string;

public class StringCreation {

	public static void main(String[] args) {
		
		//by using string literal
		String str1 = "Edubridge";
		String str2 = "Edubridge";
		
		//by using new keyword
		String str3 = new String("Edubridge");
		String str4 = new String("Edubridge");
		String str5 = new String("edubridge");
		
		//Compare
		//by ==
		System.out.println(str1 == str2);
		System.out.println(str1 == str4);
		System.out.println(str3 == str4);
		
		
		//by equals()
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
	}

}
