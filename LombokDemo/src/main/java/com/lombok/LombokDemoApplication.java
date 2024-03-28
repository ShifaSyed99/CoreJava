package com.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lombok.enitity.Menu;

@SpringBootApplication
public class LombokDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
		
		Menu m = new Menu();
		
		Menu m1 = new Menu(1, "Masala Dosa", 35, 2);
		Menu m2 = new Menu(2, "Pav Bhaji", 45, 3);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
	}

}
