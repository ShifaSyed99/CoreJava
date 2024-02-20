package com.edubridge.synchronization;

public class SynchronizationBlock {

	public static void main(String[] args) {
		
		BlockC b1 = new BlockC();
		
		BlockA b2 = new BlockA(b1);
		BlockB b3 = new BlockB(b1);
		
		b2.start();
		b3.start();
	}

}
