package com.edubridge.customexception;

import java.util.Scanner;

public class LoginExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String email = s.nextLine();
		String psd = s.nextLine();
		
		try
		{
			if(email.equals("xyz@gmail.com") && psd.equals("abc@123"))
				System.out.println("Logged in Succesfully");
			
			else
				throw new Login("Invalid Credentials");
		}
		
		catch (Login e)
		{
			System.out.println(e);
		}
		s.close();
	}

}
