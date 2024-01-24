package com.edubridge.compiletimearray;

public class CompileTimeArray {

	public static void main(String[] args) {
		
		char[] ch = {'z','s','A','P'};
		for(int i=0; i<ch.length; i++)
		{
			System.out.print(ch[i]+" ");
		}
//sysout(ch[5]) is an exeption error of array out is of bounds
	}

}
