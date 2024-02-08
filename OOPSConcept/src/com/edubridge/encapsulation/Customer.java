package com.edubridge.encapsulation;

public class Customer extends SBI {
	
	private String cust;
	private long cId;
	private int pin;
	
	public String getCust() {
		return cust;
	}
	
	public void setCust(String cust) {
		this.cust = cust;
	}
	
	public long getcId() {
		return cId;
	}
	
	public void setcId(long cId) {
		this.cId = cId;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Customer [cust=" + cust + ", cId=" + cId + ", pin=" + pin + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
