package com.edubridge.synchronization;

public class BlockA extends Thread{

	BlockC c1;

	public BlockA(BlockC c1) {
		super();
		this.c1 = c1;
	}
	
	public void run()
	{
		c1.print(10);

	}

}
