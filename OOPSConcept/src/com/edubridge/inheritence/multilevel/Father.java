package com.edubridge.inheritence.multilevel;

public class Father extends GrandFather {
	public String name;
	public int age;

	public Father(String name, int age){
		super(name, age);
		this.name = name;
		this.age = age;
		
		
		super.name = "Walt";
		super.age = 80;
	}

	@Override
	public String toString() {
		return "Father [name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
	}

}
