package com.edubridge.assigment.inheritence;

public class BankAccount {
	private int amt;
	private int bal;
	//private int money;
	
	/*public BankAccount(String accno, int bal)
	{
		this.accno = accno;
		this.bal = bal;
	}*/
	
	void deposit(int bal)
	{
		this.amt = amt;
		System.out.println("Balance amount is: "+amt);
	}
	
	void withdraw(int amt, int bal)
	{
		this.amt = amt;
		this.bal = bal;
		//this.money = money;
		
		if(bal>1000)
		{
			System.out.println("Withdraw money "+amt);
		}
		else
		{
			System.out.println("Insufficient balance "+bal);
		}
	}

}





