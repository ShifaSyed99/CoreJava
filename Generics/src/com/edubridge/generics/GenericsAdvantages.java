package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantages {

	public static void main(String[] args) {
		
		// 1. Type safety
		List<String> o1 = new ArrayList<>();
		//ensures to only add String values
		
		//3. Compile time checking
		//o1.add(11);
		o1.add("11");
		o1.add("Shifa");
		
		//2. Type casting is not required
		//List o2 = new ArrayList<>();
		List<String> o2 = new ArrayList<>();
		o2.add("Shifa");       //is considered 0 index
		o2.add("Syed");        //is considered 1 index			
		//wihout generics type casting is required
		//String s1 = (String) o2.get(0);
		
		String s1 = o2.get(0);
		System.out.println(s1);

		String s2 = o2.get(1);
		System.out.println(s2);
	}

}
