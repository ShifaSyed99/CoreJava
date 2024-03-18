package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostExec {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Post p = (Post) context.getBean("post");
		
		p.show();

	}

}
