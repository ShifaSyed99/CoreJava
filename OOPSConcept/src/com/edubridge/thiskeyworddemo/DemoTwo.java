package com.edubridge.thiskeyworddemo;
//this keyword is used to pass inside the method call
public class DemoTwo {
	
	void PrintOne(DemoTwo d)
	{
		System.out.println("Welcome Home");
	}
	
	void PrintTwo()
	{
		//method call
		PrintOne(this);
	}

	public static void main(String[] args) {

		DemoTwo d = new DemoTwo();
		d.PrintTwo();

	}

}
