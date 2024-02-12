package com.edubridge.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		List<Object> v = new Vector<>();
		
		v.add(12);
		v.add("Tom");
		v.add(125400.00);
		v.add('A');
		v.add(true);
		
		System.out.println(v);
	}

}
