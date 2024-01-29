package com.edubridge.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		StringTokenizer a = new StringTokenizer("Hey there i am using string tokens");
		StringTokenizer b = new StringTokenizer("Hey there i am using string tokens");
		//by default divided by " " viz a delimeter
		
		System.out.println(a.countTokens());
		
		System.out.println(a.nextToken());
		
		System.out.println(a.hasMoreElements());
		
		while(b.hasMoreTokens())
		{
			System.out.println(b.nextToken());
		}
	
		
		
		StringTokenizer c = new StringTokenizer("Hey-there-I-am-using-string-tokens","-",true);
		
		while(c.hasMoreTokens())
		{
			System.out.println(c.nextToken());
		}
		
		
		
		StringTokenizer d = new StringTokenizer("Hey-there-I-am-using-string-tokens","-",false);
		
		while(d.hasMoreTokens())
		{
			System.out.println(d.nextToken());
		}
	}

}
