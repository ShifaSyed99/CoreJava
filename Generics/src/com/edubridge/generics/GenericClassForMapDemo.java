package com.edubridge.generics;

//generic class by passing single string type

class Dictionary<J, K>   //T is any kind of data type.
{
	J s1;
	K s2;
	
	void print(J s1, K s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		System.out.println("The word is "+s2+" starting with "+s1);
	}
}

public class GenericClassForMapDemo {

	public static void main(String[] args) {
		
		Dictionary<Character, String> d = new Dictionary<>();
		
		d.print('C', "Cathartic");
		d.print('D', "Didactic");

	}

	}


