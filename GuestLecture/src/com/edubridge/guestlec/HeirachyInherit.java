package com.edubridge.guestlec;

class Member {
	String Name;
	String Addr;
	int Age;
	int pno;
	int Sal;
	
	void printSalary() {
		System.out.println("The salary of " +Name+ " is "+Sal );
	}
}

class Employee1 extends Member {
	String specializastion;
}

class Manager extends Member {
	String department;
}

public class HeirachyInherit {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1();
		Manager m1 = new Manager();
		
		e1.Name = "Tom";
		e1.Addr = "Mumbai";
		e1.specializastion = "Java";
		e1.Age = 20;
		e1.pno = 25501486;
		e1.Sal = 30000;
		
		System.out.println("The name is: "+e1.Name+ "\nThe Address is: "+e1.Addr+ "\nThe specialization is: "+e1.specializastion+ "\nThe age is: " +e1.Age+ "\nThe salary is: "+e1.Sal+ "\nThe number is: "+e1.pno);
				
		m1.Name = "Jerry";
		m1.Addr = "Thane";
		m1.Age = 22;
		m1.department = "HR";
		m1.pno = 25502586;
		m1.Sal = 50000;
		
		System.out.println("The name is: "+m1.Name+ "\nThe Address is: "+m1.Addr+ "\nThe specialization is: "+m1.department+ "\nThe age is: " +m1.Age+ "\nThe salary is: "+m1.Sal+ "\nThe number is: "+m1.pno);

		
		
		
				

	}

}
