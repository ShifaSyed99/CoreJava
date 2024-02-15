package com.edubridge.regex;

import java.util.regex.Pattern;



public class RegExDemo {

	public static void main(String[] args) {
		
		String s1 = "There are 5 members in my family";
		String p1 = "(T.*)(\\d+)(.*)";
		
		Pattern p2 = Pattern.compile(p1);
		
		
	}

}
