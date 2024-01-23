package com.edubridge.selectionstatement;
import java.util.Scanner;
public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age and weight of the person: ");
		int age=s.nextInt();
		int weight=s.nextInt();
		if (age>=12)
		{
			if ((weight>=45 && weight<=110)|| weight >=110)
			{
				System.out.println("eligible for bunjee jumping. if  weight is ");
			}
			else 
			{
				System.out.println("not eligible for bunjee jumping");
			}
		}
			
		else {
			System.out.println("not eligible for bunjee junmping");

		}

	}

}
