package com.edubridge.assigment;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		int res = 6, diff = 5;
	    System.out.printf("Enter the range of number(Limit):");
	    n = s.nextInt();
	    
	    for(int i=0; i<= n; i++)       //6 11 21 36 56 81
	    {
	    	/*System.out.print(res+" ");
	    	res = res + diff;			//6+5	
	        diff = diff + 5; 				//5+5
	        //next iteration */
	    	res = res + diff * i;
	    	System.out.print(" "+res);
	    }
	    //System.out.println(res);
	    s.close();
	}

	}


