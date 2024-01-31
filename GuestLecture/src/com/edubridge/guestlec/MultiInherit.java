package com.edubridge.guestlec;

class Shape {
	void draw() {
		System.out.println("Draw the shape:");
	}
}

class Rectangle extends Shape {
	void area(int l, int b) {
		System.out.println("Area of rectangle is:"+(l*b));
	}
}

class Square extends Rectangle {
	int a = 10;
	void sarea( ) {
		System.out.println("The area of suare is"+(a*a));
	}
}

public class MultiInherit {

	public static void main(String[] args) {
		
		Square s = new Square();
		
		s.sarea();
		s.area(2,3);
		s.draw();

	}

}
