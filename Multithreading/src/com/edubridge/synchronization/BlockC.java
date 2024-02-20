package com.edubridge.synchronization;

public class BlockC {

	public void print(int num)
	{
		//Synchronised Block
		synchronized(this)
		{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(num*i);
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
}	
