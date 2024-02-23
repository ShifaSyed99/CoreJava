package com.edubrudge.interview;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo implements Comparable<ComparableDemo>{

	private String name;
	private int price;
	private int rating;
	
	@Override
	public int compareTo(ComparableDemo o) {
		// TODO Auto-generated method stub
		return this.price - o.price;
	}
	
	public ComparableDemo(String name, int price, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public static void main(String[] args) {
		
		ArrayList<ComparableDemo> list = new ArrayList<ComparableDemo>();
		
		list.add(new ComparableDemo("Car" , 10000, 4));
		list.add(new ComparableDemo("Key" , 200 , 2));
		list.add(new ComparableDemo("House" , 100000, 3));
		list.add(new ComparableDemo("PC" , 50000 , 1));
		
		Collections.sort(list);
		
		for(ComparableDemo c1:list) {
			System.out.println("Prodact Name: "+ c1.getName()+"\n Product Price: "
					+c1.getPrice()+"\n Product Rating: "+c1.getRating());
		}
		
		System.out.println("");
		
		ComparatorDemo r = new ComparatorDemo();
		
		Collections.sort(list , r);
		
		for(ComparableDemo c2 : list)
		{
			System.out.println("Prodact Name: "+ c2.getName()+"\n Product Price: "
					+c2.getPrice()+"\n Product Rating: "+c2.getRating());
		}

	}

}
