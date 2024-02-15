package com.edubridge.multithreadingdemo;

//creating a thread by extending a thread class
public class ThreadDemo extends Thread{
	
	public void run()
	{
		//currentThread() will give current executing thread
		System.out.println("Thread is in the running state: "+Thread.currentThread());
	}

	public static void main(String[] args) {
		
		/*ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo(); */
		
		for(int i = 1; i < 4; i++)
		{
			//System.out.println(t1.getName()+" "+t2.getName());
			ThreadDemo t1 = new ThreadDemo();
			ThreadDemo t2 = new ThreadDemo(); 
			t1.start();
			t2.start();
		}
		
		//when we call start() it automatically calls run()
		//t1.start();
		//t1.run();
		//t2.start();
		//we can go from start() to run() and vice versa but not from start() to start()
	}

}
