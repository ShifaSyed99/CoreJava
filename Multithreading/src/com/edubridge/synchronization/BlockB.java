package com.edubridge.synchronization;

public class BlockB extends Thread{
	BlockC c1;

	public BlockB(BlockC c1) {
		super();
		this.c1 = c1;
	}
	
	public void run()
	{
		c1.print(10);

	}

}
