package com.spring.withmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionExec {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Question q1 = (Question) context.getBean("q");
		
		q1.disp();

	}

}
