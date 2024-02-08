package com.edubridge.assigment.polymorphism;

public class Sports {
	
	public void play()
	{
		System.out.println("Sports played.");
	}
	
	class Football extends Sports {
		@Override
		public void play()
		{
			System.out.println("A sport played by Legs.");
		}
	}
	
	class Basketball extends Sports {
		@Override
		public void play()
		{
			System.out.println("A sport played by Hands.");
		}
	}
	
	class Rugby extends Sports {
		@Override
		public void play()
		{
			System.out.println("A sport played by Tackling.");
		}
	}
	
public static void main(String[] args) {
		
		//Sports s = new Sports();
		//System.out.println(s instanceof Sports);
		Football f = new Football();
		//System.out.println(s instanceof Football);
		Basketball b = new Basketball();
		Rugby r = new Rugby();
		
		//s.play();
		f.play();
		b.play();
		r.play();

	}

}



	