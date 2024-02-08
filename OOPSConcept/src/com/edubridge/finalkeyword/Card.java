package com.edubridge.finalkeyword;

public class Card {

	private String cName;
	//private final string issuer
	private final String issuer = "GOI";
	
	//getter and setter
	public String getcName() {
		return cName;
	}
	
	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getIssuer() {
		return issuer;
	}

	@Override
	public String toString() {
		return "Card [cName=" + cName + ", issuer=" + issuer + ", getcName()=" + getcName() + ",toString()"+ super.toString() +"]";
	}

	/*@Override
	public String toString() {
		return "Card [cName=" + cName + ", issuer=" + issuer + "]";*/
	
	
	}
	
	
	
	

