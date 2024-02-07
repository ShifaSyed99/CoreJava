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
class Animal {
	void eat() {
		System.out.println("Animal Behavior:");
	}
}

class Cat1 {
	void eat() {
		System.out.println("Animal Behavior:");
	}
}

class Dog1 {
	void eat() {
		System.out.println("Animal Behavior:");
	}
}

//main class
public class Polymorph {

	public static void main(String[] args) {

//Overload		
		calc c = new calc();
		
		c.add(10, 20);
		c.add("Hello ", "World");
		c.add(12, 21, 35);
		
//Override		
		Animal a1 = new Animal();
		Cat1 c1 = new Cat1();
		Dog1 d1 = new Dog1();
		
		a1.eat();
		c1.eat();
		d1.eat();

	}

}
