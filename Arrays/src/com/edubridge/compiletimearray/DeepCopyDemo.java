package com.edubridge.compiletimearray;
//array deep copy
public class DeepCopyDemo {

	public static void main(String[] args) {
		int a[] = {2, 11, 67, 43, 5};
		int b[] = a.clone(); //copying the array
		
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
			

	}

}
