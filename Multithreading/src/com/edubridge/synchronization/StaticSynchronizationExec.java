package com.edubridge.synchronization;

public class StaticSynchronizationExec {

	public static void main(String[] args) {
		
		StaticSynchronizationA s = new StaticSynchronizationA();
		
		StaticSynchronizationC c1 = new StaticSynchronizationC(s);
		StaticSynchronizationC c2 = new StaticSynchronizationC(s);
		
		c2.setPriority(2);
		c1.setPriority(10);

		c1.start();
		
	}

}
