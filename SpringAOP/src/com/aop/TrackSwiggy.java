package com.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackSwiggy {
	
	@Pointcut("execution(* Swiggy.*(..))")
	//@Pointcut("execution(* Swiggy.nonVegMenu(..))")
	
	public void vegMenu() {}
	
	/*@Before("vegMenu()")
	public void Suggestion(JoinPoint p) {
		System.out.println("This is Additional method.");
	}
	*/

	/*@After("vegMenu()")
	public void Suggestion(JoinPoint p) {
		System.out.println("This is Additional method.");
	}*/
	

	/*@Around("vegMenu()")
	public void Suggestion(JoinPoint p) {
		System.out.println("This is Additional method.");
	}*/


	@AfterReturning("vegMenu()")
	public void Suggestion(JoinPoint p) {
		System.out.println("This is Additional method.");
	}



}
