package com.edubridge.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> obj1 = new LinkedList<>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		System.out.println(obj1);
		
		System.out.println(obj1.get(2));
		
		obj1.add(0, 0);
		System.out.println(obj1);
		
		System.out.println(obj1.getClass());
		
		System.out.println(obj1.contains(2));
		
		//for extracting list element
		for(Integer x : obj1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		Iterator<Integer> i = obj1.listIterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		

	}

}
