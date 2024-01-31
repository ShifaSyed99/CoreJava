package com.edubridge.guestlec;

public class Employee {

	int empId = 101;
	
	int empAge = 20;
	
	String empName = "John Smith";
	
	void Test() {
	System.out.println("Testing");
	}
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		
		System.out.println("Employee Id is:" +e1.empId+ "\nEmployee Name is:" +e1.empName+  "\nEmployee Age is:"+e1.empAge);

		e1.Test();
	}

}
