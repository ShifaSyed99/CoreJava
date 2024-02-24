package com.edubrudge.interview;

import java.util.Scanner;

public class StringVowelsAndConstants {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char c1[] = {'a',  'e',  'i',  'o',  'u'};
		
		System.out.println("Enter a string: ");
		String a = s.nextLine();
		
		a = a.toLowerCase();
		
		int vcount = 0;
		int ccount = 0;
		
		for(int i = 0; i <= a.length(); i++)
		{
			char ch = a.charAt(i);
			if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vcount++;
			else
				ccount++;
		}
		System.out.println("Total vowels are : "+vcount);
		System.out.println("Total constants are : "+ccount);
		/*a = a.toLowerCase();
		
		char c[] = a.toCharArray();
		
		for(int i = 0; i <= c.length; i++)
		{
			for(int j = 0 ; j <= c1.length; j++)
			{
			if(i == )
				System.out.println("The vowels are:"+c[i]);
		}
	}
		/*String b = s.next();
		for(int i = 0; i <= b.length(); i++)
		{
			char[] b1 = b.toCharArray();
			
			if(b1[i] == 'a'|| 'A'|| 'e'|| 'E'|| 'i'|| 'I'|| 'o'|| 'O'|| 'u'|| 'U')
		}
		
		
		System.out.println("Enter a string: ");
		String a = s.next();
		a  = a.toLowerCase();
		
		for(int i = 0)
		char ch[] = a.charAt(0);*/
		
	}
}
