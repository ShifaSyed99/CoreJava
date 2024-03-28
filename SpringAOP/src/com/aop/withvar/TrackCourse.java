package com.aop.withvar;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCourse {
	
	@Pointcut("execution (* Course.getcName(..))")
	
	public void selectGetName() {}
	
	@Before("selectGetName()")
	
	public void breakm() {
		System.out.println("Break Time");
	}

}
