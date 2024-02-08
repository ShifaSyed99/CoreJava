package com.edubridge.assigment.inheritence;

public class BankAccount {
	private String accno;
	private double bal;
	
	public BankAccount(String accno, double bal)
	{
		this.accno = accno;
		this.bal = bal;
	}
	void deposit(double amount)
	{
		amount = 150000.23;
	}
	
	void withdraw(double amount)
	{
		amount = 10000.00;
	}

}
