package com.edubridge.classandobject;

class Rectangle
{
	//instance var
	int length;
	int breadth;
	
	//parameterized constructor
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	Rectangle()
	{
		System.out.println("Rectangle");
	}
	
	void dispAreaPerimeter()
	{
		System.out.println("Area of Rectangle is: "+length*breadth);
		System.out.println("Preimeter of Rectangle is: " +2*(length+breadth));
	}
	
}

public class ConstructorExecutor {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		Rectangle r3 = new Rectangle();
		
		r1.dispAreaPerimeter();
		r2.dispAreaPerimeter();

	}

}
