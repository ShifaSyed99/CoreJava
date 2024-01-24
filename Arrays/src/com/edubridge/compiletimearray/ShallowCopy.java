package com.edubridge.compiletimearray;

public class ShallowCopy {

	public static void main(String[] args) {
		int a[][] = {{1,2},{3,4}};
		int b[][] = a.clone();
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
