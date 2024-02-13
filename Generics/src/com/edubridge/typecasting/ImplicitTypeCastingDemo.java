package com.edubridge.typecasting;

public class ImplicitTypeCastingDemo {

	public static void main(String[] args) {
		
		//implicit : smaller to larger
		char c ='b';
		int n = c;
		System.out.println(n);
		
		//explicit : larger to smaller
		int m = 63;
		int l = 15;
		char a = (char) m;
		char d = (char) l;
		System.out.println(a);
		System.out.println(d);

	}

}
