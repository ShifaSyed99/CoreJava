package com.edubridge.checkedexception;

import java.io.IOException;
import java.util.Scanner;


public class ThrowAndThrows {
	
	public static void donate(int age, int weight) throws IOException { //throws Exception
		//throws keyword is used to declare a checked exception
		
		if(age > 18 && weight > 45)
			System.out.println("Eligible to donate blood");
		else
			throw new IOException("Not eligible");
		//throw keyword is used to throw an exception explicitly
	}

	public static void main(String[] args) throws IOException {  ////throws Exception
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt(); 
		
		try
		{
		ThrowAndThrows.donate(age, weight);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		s.close();

	}

}
