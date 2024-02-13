package com.edubridge.map;

import java.util.Hashtable;
//import java.util.LinkedHashMap;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Map<Integer, Object> l = new Hashtable<>();
		l.put(1, "Tom");
		l.put(5, "Jerry");
		l.put(1, "Tommy");
		l.put(3, "Taz");
		/* we cant give null as value and key in Hashtable
		l.put(4, null);*/
		//will print the recent value at key 1
		System.out.println(l);
		

	}

}
