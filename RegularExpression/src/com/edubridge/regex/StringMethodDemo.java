package com.edubridge.regex;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		String str1 = "Edubridge is in Thane ";
		String[] str2 = str1.split(" ");
		
		for(String i : str2)
		{
			System.out.println(i+" ");
		}
		System.out.println();
		
		String str3 = "There are 5 members in my family";
		String str4 = "\\d+";     //denotes digit
		String res = str3.replaceAll(str4, "Five");      //-str3.replaceAll(regex, replace)
		
		System.out.println(res);
		
		

	}

}
