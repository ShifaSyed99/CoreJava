package com.edubridge.map;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, Object> l = new LinkedHashMap<>();
		l.put(1, "Tom");
		l.put(5, "Jerry");
		l.put(1, "Tommy");
		l.put(3, "Taz");
		l.put(4, null);
		//will print the recent value at key 1
		System.out.println(l);
		
		for(Map.Entry<Integer, Object> i : l.entrySet() )
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}

	}

}
