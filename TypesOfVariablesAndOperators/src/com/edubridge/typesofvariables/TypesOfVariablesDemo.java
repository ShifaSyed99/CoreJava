package com.edubridge.typesofvariables;

public class TypesOfVariablesDemo {

	//instance var
			float sal = 78900.56f;
			
	//static var
			static int a = 10; //same value for all a in the code since static
			
			String display()
			{
				//local var
				@SuppressWarnings("unused")
				char res = 'z';
				System.out.println(res);
				return "Local variable";
			}
			
	public static void main(String[] args) {
		System.out.println(a);
		TypesOfVariablesDemo obj = new TypesOfVariablesDemo(); //create object to get value from display()
																//since the method isnt static
		System.out.println(obj.display()); //call using obj
		System.out.println(obj.sal); 
	}

}
