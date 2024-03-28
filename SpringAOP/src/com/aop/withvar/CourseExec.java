package com.aop.withvar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseExec {

public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beanc.xml");
		
		Course c = (Course) ctx.getBean("c1");
		
		c.getcId();
		
		c.getcName();
}

}
