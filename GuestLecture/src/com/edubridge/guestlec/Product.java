package com.edubridge.guestlec;

public class Product {
	
	String pname ;
	
	int price ;
	
	void disp(String n, int p) {
		pname = n;
		price = p;
		
		System.out.println("Name:"+pname+"\nPrice:"+price);
	}

	public static void main(String[] args) {
		
		Product pd = new Product();
		
		pd.disp("Speakers", 20000);
		pd.disp("TV", 50000);
		pd.disp("Shoes", 3000);

	}

}
