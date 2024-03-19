package com.jdbc.withspring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExec {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		/*int status=dao.saveEmployee(new Employee(107,"meena",16000));
		System.out.println(status);*/
		
		List<Employee> employees =dao.employee();

		 for (Employee record : employees) {
		 System.out.print("ID : " + record.getId());
		 System.out.print(", Name : " + record.getName());
		 System.out.println(", salary : " + record.getSalary());
		 }

		//dao.updateEmployee(106, "Mohad",32000);
		
		
		Employee e=new Employee();
		e.setId(107);
		int status=dao.deleteEmployee(e);
		System.out.println(status);
		
	}

}