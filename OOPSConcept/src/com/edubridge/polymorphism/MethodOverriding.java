package com.edubridge.polymorphism;
//child parent method overriding executor class
public class MethodOverriding {

	public static void main(String[] args) {
		
		GoogleMeet g = new GoogleMeet();
		g.accept("GoogleMeet", "xyz@gmail.com");
		//System.out.println(g.appn+" GoogleMeet",+g.mail+ " xyz@gmail.com");
		System.out.println(g instanceof Google);
	}

}
