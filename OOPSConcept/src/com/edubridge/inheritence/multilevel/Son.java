package com.edubridge.inheritence.multilevel;

public class Son extends Father {
	
	public String name;
	public int age;

	public Son(String name, int age){
		super(name, age);
		this.name = name;
		this.age = age;
		
		super.name = "Tom";
		super.age = 55;
		
	}

	@Override
	public String toString() {
		return "Son [name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
	}
	
}	
