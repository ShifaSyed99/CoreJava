package com.edubridge.synchronization;

public class StaticSynchronizationA {
	
	synchronized static void display(String s)
	{
		for(int i = 1; i <= 3; i++)
		{
			System.out.println("Welcome To Edubridge");
			System.out.println(s);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

}
