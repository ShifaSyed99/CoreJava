package com.edubridge.interfacedemo;
//implementable class
//class can only "implement" an interface
public class TheVibe implements Cafe{

	@Override
	public void showMenu() {
		System.out.println("The Menu is: "+menu);
		
	}

	@Override
	public void displayPrice() {
		System.out.println("The price for "+menu+ " is: "+price);
		
	}

}
