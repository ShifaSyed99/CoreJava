package com.edubridge.structural.facade;

public class KFC implements Franchise{

	@Override
	public void Option() {
		System.out.println("KFC");
		
	}

	@Override
	public void Cost() {
		System.out.println("150000 Rs");
		
	}

}
