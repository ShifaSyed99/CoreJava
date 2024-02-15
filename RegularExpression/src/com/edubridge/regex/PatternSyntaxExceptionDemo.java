package com.edubridge.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionDemo {
	
	static String regex = "[";
	static String s1 = "I love Mumbai";
	static String r = "cat";

	public static void main(String[] args) {
		
		try
		{
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(s1);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("PatternSyntaxException : ");
			System.out.println("Description :"+e.getDescription());
			System.out.println("Index : "+e.getIndex());
			System.out.println("Message : "+e.getMessage());
		}

	}

}
