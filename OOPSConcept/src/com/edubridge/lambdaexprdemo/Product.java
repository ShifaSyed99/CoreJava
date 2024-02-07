package com.edubridge.lambdaexprdemo;

public interface Product {
	
	//abstract method
	void dispPprice(int price);
	
	//default method
	default String dispPname()
	{
		return "Perfume";
	}
	
	//static method
	static String Pbrand()
	{
		return "Lush";
	}

}
