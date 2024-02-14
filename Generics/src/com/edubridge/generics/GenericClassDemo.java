package com.edubridge.generics;

//generic class by passing single string type

class Citizen<T>   //T is any kind of data type.
{
	T s1;
	T s2;
	
	void print(T s1, T s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		System.out.println("The citizen is from "+s1+" with "+s2+" nationality");
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		
		Citizen<String> c = new Citizen<>();
		
		c.print("Navi Mumbai", "Indian");

	}

}
