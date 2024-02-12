package com.edubridge.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueandDequesDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(44);
		q.add(25);
		q.add(3);
		q.add(10);
		
		System.out.println(q);
		
		for(int i:q)
		{
			System.out.println(i+" ");
		}
		
		
		Deque<Integer> d = new LinkedList<>();
		
		d.add(44);
		d.add(25);
		d.add(3);
		d.add(10);
		
		System.out.println(d);
		
		d.addFirst(1);
		d.removeLast();
		System.out.println(d);
		
		System.out.println(d.peek());
		System.out.println(d.descendingIterator());
		System.out.println(d);
		
		d.pollLast();
		d.pollLast();
		d.pollLast();
		d.pollLast();
		//last polllast() gives null list
		d.pollLast();
		
		System.out.println(d);
		
		Deque<Integer> e = new ArrayDeque<>();
		
		e.add(44);
		e.add(25);
		e.add(3);
		e.add(10);
		System.out.println(e);
		
		//System.out.println(e.descendingIterator());
		
		
		e.remove();
		e.remove();
		e.remove();
		e.remove();
		//fifth remove gives exception error
		e.remove();
	}

}
