package com.aop.withvar;

public class Course {

	private int cId;
	
	private String cName;

	public int getcId() {
		System.out.println(cId);
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		System.out.println(cName);
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
}
