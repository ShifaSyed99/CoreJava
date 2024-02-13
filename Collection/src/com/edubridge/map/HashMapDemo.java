package com.edubridge.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> h = new HashMap<>();
		h.put(1, "Tom");
		h.put(2, "Jerry");
		h.put(1, "Tommy");
		h.put(3, "Taz");
		h.put(1, "Spike");
		h.put(4, null);
		//will print the recent value at key 1
		System.out.println(h);
		
		System.out.println(h.containsKey(2));
		
		//will remove all the values associated with key 1
		h.remove(1,"Spike");
		
		System.out.println(h);
		
		System.out.println(h.size());
		
	}

}
