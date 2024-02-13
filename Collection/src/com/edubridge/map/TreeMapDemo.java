package com.edubridge.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		SortedMap<String, Float> s = new TreeMap<>();
		s.put("Shifa", 75.24f );
		s.put("Saniya",85.45f );
		s.put("Sakshi", 78.25f );
		
		for(Map.Entry<String, Float> itr : s.entrySet())
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
		

	}

}
