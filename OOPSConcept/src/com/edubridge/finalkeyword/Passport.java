package com.edubridge.finalkeyword;

public class Passport extends Card {
	
	private final String passportno = "IND64545152";
	private String DOExpiry;
	
	public String getDOExpiry() {
		return DOExpiry;
	}
	
	public void setDOExpiry(String dOExpiry) {
		DOExpiry = dOExpiry;
	}
	
	public String getPassportno() {
		return passportno;
	}

	@Override
	public String toString() {
		return "Passport [passportno=" + passportno + ", DOExpiry=" + DOExpiry + ", toString()=" + super.toString()
				+ "]";
	}

	/*@Override
	public String toString() {
		return "Passport [passportno=" + passportno + ", DOExpiry=" + DOExpiry + "]";*/
	
	
	
	
	
	
	

}
