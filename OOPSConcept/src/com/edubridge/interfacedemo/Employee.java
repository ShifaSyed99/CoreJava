package com.edubridge.interfacedemo;
//cloneable built in MI 
//if we are not implementing a cloneable interface and if we are invoking the clone method in the driver class we will get an
//exception as class not supported exception
public class Employee implements Cloneable{
	
	public int empid;
	public String empn;
	public long sal;
	public Employee(int empid, String empn, long sal) {
		super();
		this.empid = empid;
		this.empn = empn;
		this.sal = sal;
	}
	
	void disp()
	{
		System.out.println("Employee ID is: "+empid);
		
		System.out.println("Employee Name is: "+empn);
		
		System.out.println("Employee Salary is: "+sal);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
