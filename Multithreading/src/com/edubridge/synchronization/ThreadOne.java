package com.edubridge.synchronization;

public class ThreadOne extends Thread {
	
	//ref obj for SynchronizedMethod class to access print()
	SynchronizedMethod m1;

	public ThreadOne(SynchronizedMethod m1) {
		super();
		this.m1 = m1;
	}
	
	public void run()
	{
		m1.print(10);
	}
	
}
