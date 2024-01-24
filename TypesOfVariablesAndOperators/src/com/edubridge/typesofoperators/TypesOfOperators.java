package com.edubridge.typesofoperators;

import java.util.Scanner;

public class TypesOfOperators {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the values:");
		//int a = s.nextInt();
		//int b = s.nextInt();
		//int c = s.nextInt();
		//int d = s.nextInt();
		
//Arithmetic
		/*System.out.println("The Arithmetic Values:");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);


//Relational
		System.out.println("The Relational Values:");
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
//Logical
		System.out.println("The Logical Values:");
		System.out.println((a==5 && b>a));
		System.out.println((a==5 || b>a));
		System.out.println(!(a<=b));
		
		
//Assignment
		System.out.println("The Assignment Values:");
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a);
		
		
////Bitwse and Shifting
		System.out.println("The Bitwise and Shifting Values:");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<b);
		System.out.println(a>>b);*/
		
		
		
/*//IncrementAndDecrement		
		int j = 6;
		int k = 3;
		@SuppressWarnings("unused")
		int res1 = j++ - ++k;//6 - 4 and then post increment j
		@SuppressWarnings("unused")
		int res2 = --j + k--; //6 + 4 and then post decrement k
		System.out.println(j);
		System.out.println(k);*/
		
		
		
//Ternary		
		System.out.println("The Ternary Values:");
		@SuppressWarnings("unused")
		String res = (72%2 == 0)? "Even":"Odd";	
		
		s.close();

	}

}
