package com.spring.withconstructor;

public class Course {
	
	private int cId;
	
	private String cName;
	
	private int fees;
	
	private int duration;

	
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", fees=" + fees + ", duration=" + duration + "]";
	}


	public Course(int cId, String cName, int fees, int duration) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.fees = fees;
		this.duration = duration;
	}
	
	

}
