package com.edubridge.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		s.add("Shifa");
		s.add("Sakshi");
		s.add("Syed");
		s.add("Shreyash");
		System.out.println(s);//wont be ordered
		
		Set<String> l = new LinkedHashSet<>();
		l.add("Shifa");
		l.add("Sakshi");
		l.add("Syed");
		l.add("Shreyash");
		System.out.println(l);//will be ordered
		
		Set<String> t = new TreeSet<>();
		t.add("Shifa");
		t.add("Sakshi");
		t.add("Syed");
		t.add("Shreyash");
		System.out.println(t);//will be sorted

	}

}
