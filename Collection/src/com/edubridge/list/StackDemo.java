package com.edubridge.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Object> s = new Stack<>();
		
		s.add("Tom");
		s.add('c');
		s.push(12);
		s.push(654.23);
		
		System.out.println(s);
		
		System.out.println(s.lastElement());
		
		//pop or remove last element
		s.pop();
		System.out.println(s);
	}
}
