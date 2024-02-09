package com.edubridge.customexception;

@SuppressWarnings("serial")
public class Login extends Exception {

	//to pass error message
	private String str;

	public Login(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "Login [str=" + str + "]";
	}
	
}
