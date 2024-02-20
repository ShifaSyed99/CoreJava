package com.edubridge.synchronization;

public class StaticSynchronizationC extends Thread{
	
	StaticSynchronizationA b;

	public StaticSynchronizationC(StaticSynchronizationA b) {
		super();
		this.b = b;
	}
	
	public void run()
	{
		StaticSynchronizationA.display(getName());
	}

}
