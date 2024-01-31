package com.edubridge.guestlec;

class Dog{
	String colour = "Golden";
}

class Cat extends Dog{                     //cat is accessing the data of dog class
	String color = "Orange";
}

public class AnimalInheritance {

	public static void main(String[] args) {
		// Dog d = new Dog();             since object of cat class can access dog class
		
		Cat c = new Cat();
		
		System.out.println("Cat Color : "+c.color+ "\nDog Color : "+c.colour );

	}

}
