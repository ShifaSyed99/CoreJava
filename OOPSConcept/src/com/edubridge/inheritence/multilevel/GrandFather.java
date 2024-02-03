package com.edubridge.inheritence.multilevel;

public class GrandFather {
	
	public String name;
	public int age;

	public GrandFather(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "GrandFather [name=" + name + ", age=" + age + "]";
	}
}
