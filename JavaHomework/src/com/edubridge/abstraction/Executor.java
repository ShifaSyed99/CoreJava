package com.edubridge.abstraction;

public class Executor {

	public static void main(String[] args) {
		
		Motorcycle m = new Motorcycle();
		m.startEngine();
		m.stopEngine();
		
		Car c = new Car();
		c.startEngine();
		c.stopEngine();
	}

}
