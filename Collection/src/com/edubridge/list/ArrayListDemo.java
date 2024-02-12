package com.edubridge.list;

import java.util.ArrayList;
import java.util.List;

//import java.util.Collection;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//cannot create object since Collection is an interface
		//Collection<Integer>obj = new Collection<>();
		
		List<String> obj1 = new ArrayList<>();
		obj1.add("Tom");
		obj1.add("Jerry");
		obj1.add("Spike");
		System.out.println(obj1);
		System.out.println(obj1.get(2));
		
		List<String> obj2 = new ArrayList<>();
		obj2.addAll(obj1);
		System.out.println(obj2);
		System.out.println(obj2.remove(1));
		System.out.println(obj2);
		
		
		List<Object> obj3 = new ArrayList<>();
		obj3.add("Tom");
		obj3.add(613);
		obj3.add(25.5);
		System.out.println(obj3);

	}

}
