package com.edubridge.polymorphism;

//child class
public class GoogleMeet extends Google {

	String appn;
	String mail;
	
	public void accept(String appn, String mail)
	{
		super.accept("Google", "abc@gmail.com");
		System.out.println(appn+" "+mail);
	}


}
