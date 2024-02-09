package com.edubridge.assigment.polymorphism;

public class Sports {
	
	String sname;
	int totmem;
	
	public void play(String sname, int totmem)
	{
		this.sname = sname;
		this.totmem = totmem;
		System.out.println("Sports played.");
	}
}
	
	class Football extends Sports {
		@Override
		public void play(String sname, int totmem)
		{
			/*sname = "Football";
			totmem = 11;*/
			System.out.println("Sports name: "+sname+"\nTotal Members: "+totmem);
		}
	}
	
	class Basketball extends Sports {
		@Override
		public void play(String sname, int totmem)
		{
			/*sname = "Basketball";
			totmem = 12;*/
			System.out.println("Sports name: "+sname+"\nTotal Members: "+totmem);
		}
	}
	
	class Rugby extends Sports {
		public void play(String sname, int totmem)
		{
			/*sname = "Rugby";
			totmem = 13;*/
			System.out.println("Sports name: "+sname+"\nTotal Members: "+totmem);
		}
	}
	





	