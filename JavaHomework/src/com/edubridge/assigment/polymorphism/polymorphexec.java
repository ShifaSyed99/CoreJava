package com.edubridge.assigment.polymorphism;

import com.edubridge.assigment.polymorphism.Sports.Basketball;
import com.edubridge.assigment.polymorphism.Sports.Football;
import com.edubridge.assigment.polymorphism.Sports.Rugby;

public class polymorphexec {
	
public static void main(String[] args) {
		
		Sports s = new Sports();
		//System.out.println(s instanceof Sports);
		Football f = new Football();
		Basketball b = new Basketball();
		Rugby r = new Rugby();
		
		s.play();
		f.play();
		b.play();
		r.play();

	}

}


}
