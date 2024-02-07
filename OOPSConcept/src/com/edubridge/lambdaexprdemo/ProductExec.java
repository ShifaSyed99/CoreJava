package com.edubridge.lambdaexprdemo;
//functional interface with lambda expr
public class ProductExec {

	public static void main(String[] args) {
		
		//lambda expr
		Product p = (price)-> {
			System.out.println("Price is: "+price);
		};
		System.out.println("The product is: "+p.dispPname());
		System.out.println("The brand is: "+Product.Pbrand());
		p.dispPprice(2000);
	

	}

}
