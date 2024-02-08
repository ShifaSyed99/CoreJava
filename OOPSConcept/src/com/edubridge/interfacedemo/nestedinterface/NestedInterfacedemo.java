package com.edubridge.interfacedemo.nestedinterface;

import com.edubridge.interfacedemo.nestedinterface.Books.StoryBooks;

public class NestedInterfacedemo implements Books,StoryBooks {
	
//	OR public class NestedInterfacedemo implements Books,Books.StoryBooks {

	public static void main(String[] args) {
		
		NestedInterfacedemo n = new NestedInterfacedemo();
		n.sBooks();
		n.sstBooks();
	}

	@Override
	public void sBooks() {
		System.out.println("The Kite Runner.");
		
	}

	@Override
	public void sstBooks() {
		System.out.println("Java Programming-"+" "+"By Yashwant");
		
	}

}
