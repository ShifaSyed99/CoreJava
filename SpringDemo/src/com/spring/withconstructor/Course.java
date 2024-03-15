package com.spring.withconstructor;

public class Course {

	private int cId;
	
	private String cName;
	
	private int price;
	
	private String duration;

	public Course(int cId, String cName, int price, String duration) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.price = price;
		this.duration = duration;
	}
	
	public void show() {
		System.out.println("Course ID is : "+cId+"\nCourse Name is : "+cName+"\nCourse Price is : "+price+"\nCourse Duration is : "+duration);
	}
}
