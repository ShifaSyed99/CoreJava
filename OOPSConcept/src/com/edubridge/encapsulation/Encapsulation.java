package com.edubridge.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setBranch("Nerul");
		c.setIFSC("SBI20012");
		c.setCust("Shifa");
		c.setcId(1234);
		c.setPin(5678);
		
		System.out.println(c.getBranch());
		System.out.println(c);

	}

}
