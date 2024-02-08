package com.edubridge.interfacedemo.multipleinheritence;

//child class

public class Boruto implements Naruto, Hinata {

	@Override
	public void powerOne(int nochildren, String position) {
		System.out.println(nochildren+" "+position);
		
	}
	
	@Override
	public void powerTwo(int nochildren, String clan) {
	
		System.out.println(nochildren+" "+clan);
		
	}



}
