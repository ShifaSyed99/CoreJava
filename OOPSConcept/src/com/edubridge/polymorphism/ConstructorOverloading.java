package com.edubridge.polymorphism;

class Renault
{
	String cname;
	String eng;
	String color;
	int cseats;
	float cprice;
	
	Renault(String cname, String color, int cseats)
	{
		this.cname = cname;
		this.color = color;
		this.cseats = cseats;
		System.out.println("Car Name "+cname+" Car Color"+color+" Car seats"+cseats);
		
	}
	
	Renault(String cname, String eng, float cprice)
	{
		this.cname = cname;
		this.eng = eng;
		this.cprice = cprice;
		System.out.println("Car Name "+cname+" Car Engine"+eng+" Car Price"+cprice);
		
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Renault r = new Renault("RXE","Blue",6);
		Renault r1 = new Renault("Duster", "CNG",850000f);

	}

}
