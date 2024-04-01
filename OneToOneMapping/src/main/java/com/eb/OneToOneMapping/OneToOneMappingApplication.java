package com.eb.OneToOneMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.eb.OneToOneMapping.model.Address;
import com.eb.OneToOneMapping.model.Employee;
import com.eb.OneToOneMapping.repository.AddressRepository;
import com.eb.OneToOneMapping.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(OneToOneMappingApplication.class, args);
		EmployeeRepository empr = ctx.getBean(EmployeeRepository.class);
		AddressRepository addr = ctx.getBean(AddressRepository.class);
		
		Address add = new Address();
		add.setZipCode("425201");
		add.setCountry("USA");
		add.setState("New York");
		
		Employee emp = new Employee();
		emp.setEmpName("Mark");
		emp.setAddress(add);
		empr.save(emp);
		
	}

}
