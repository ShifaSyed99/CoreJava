package com.edubridge.classandobject;

class Vegetable
{
	//Variables
	String v_name;
	int pr;
	
	//Methods
	void print()
	{
		System.out.println("Vegetable Name is :"+v_name+"\n Price is:"+pr);
	}
	
}

public class ClassAndObjectExec {
	public static void main(String args[])
	{
		Vegetable v = new Vegetable();
		v.v_name = "Spinach";
		v.pr = 50;
	}
}






//write a prg to print area of two rect having side 4,5 and 5,8 by creating a vlass named as rectangle with a
//method name Area which returns area and length and breadth and perimeter passed as parameter
//to its constructor*/