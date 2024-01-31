package com.edubridge.guestlec;
//Overload example
class calc
{
	void add(String a, String b)
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	void add(int a, int b)
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	void add(int a, int b,int c)
	{
	System.out.println("Addition is: "+(a+b));
	}
}

//override

//main class
public class Polymorph {

	public static void main(String[] args) {

		calc c = new calc();
		
		c.add(10, 20);
		c.add("Hello ", "World");
		c.add(12, 21, 35);

	}

}
