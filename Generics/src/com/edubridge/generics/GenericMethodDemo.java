package com.edubridge.generics;


public class GenericMethodDemo {
	
	public static <E>void accept(E[] a)
	{
		for(E i : a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Integer[] a1 = {1, 2, 3, 4, 5, 6};
		Character[] a2 = {'A','B', 'C', 'D', 'E'};
		
		System.out.println("The first array is: ");
		GenericMethodDemo.accept(a1);
		
		System.out.println("The second array is: ");
		GenericMethodDemo.accept(a2);

	}

}
