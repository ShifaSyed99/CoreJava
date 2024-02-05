package com.edubridge.thiskeyworddemo;

/*It can be used to refer instance var of current class*/

class Account
{
	//instance var
	public String acctype;
	public long accno;
	
	public void setData(String acctype, long accno )//method
	{
		this.acctype = acctype; //using this keyword to invoke this method parameters
		this.accno = accno;
	}
	
	public void disp()
	{
		System.out.println(acctype+" "+accno);
	}
}
public class DemoOne {

	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setData("Savings", 123456789);
		a.disp();

	}

}
