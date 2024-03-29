package com.em;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.em.pojo.Employee;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
		
		Employee e = new Employee();
		e.setEmpId(1);
		e.setEmpName("Jane Doe");
		
		System.out.println("Employee ID is "+e.getEmpId()+"\nEmployee Name is "+e.getEmpName());
	}

}
