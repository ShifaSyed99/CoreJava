package com.edubridge.polymorphism;

//method overloading

class Stocks
{
	String sname;
	String stype;
	long sprice;
	
	public static void disp(String sname, String stype)
	{
		System.out.println(sname+" "+stype);
	}
	
	public static void disp(String sname, long sprice)
	{
		System.out.println(sname+" "+sprice);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Stocks.disp("Birla", "Nift-Fifty");
		Stocks.disp("Birla", 2500);

	}

}
