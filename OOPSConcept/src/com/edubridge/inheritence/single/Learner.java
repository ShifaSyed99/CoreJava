package com.edubridge.inheritence.single;
//Child class
public class Learner extends Trainer {
	
	public String Learnername;
	public int Rollno;
	
	public void display()
	{
		super.display();
		System.out.println(Learnername+" "+Rollno);
	}

}
