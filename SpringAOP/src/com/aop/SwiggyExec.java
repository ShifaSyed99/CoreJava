package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwiggyExec {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		Swiggy t = (Swiggy) ctx.getBean("sw");
		
		System.out.println("Calling Methods.");
		
		t.starterMenu();
		
		t.vegMenu();
		
		t.nonVegMenu();
		
		

	}

}
