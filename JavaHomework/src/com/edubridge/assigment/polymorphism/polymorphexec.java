package com.edubridge.assigment.polymorphism;

//import com.edubridge.assigment.polymorphism.Sports.Basketball;
//import com.edubridge.assigment.polymorphism.Sports.Football;
//import com.edubridge.assigment.polymorphism.Sports.Rugby;

public class polymorphexec {
	
public static void main(String[] args) {
		
		//Sports s = new Sports();
		//System.out.println(s instanceof Sports);
		
		Football f = new Football();
		f.play("FootBall", 11);
		
		Basketball b = new Basketball();
		b.play("BasketBall", 12);
		
		Rugby r = new Rugby();
		r.play("Rugby", 15);
		
	

	}

}



