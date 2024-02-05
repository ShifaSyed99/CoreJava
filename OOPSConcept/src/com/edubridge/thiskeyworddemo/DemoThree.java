package com.edubridge.thiskeyworddemo;
//this keyword is used to invoke current class constructor
public class DemoThree {
	
	public int x;
	DemoThree()//non
	{
		//but this(1) calls parameterized
		this(1);
		System.out.println("Non Paramterized");
	}
	
	DemoThree(int x)
	{
		//so this will print first then non parameterized
		System.out.println("Parameterized "+x);
	}

	public static void main(String[] args) {

		DemoThree d = new DemoThree();
	//this will call non parameterized

	}

}
