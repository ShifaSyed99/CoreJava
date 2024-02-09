package com.edubridge.checkedexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		File f = new File("D:\\CoreJava_Shifa\\tkn.txt");
		
		try {
			FileInputStream f1 = new FileInputStream(f);
			System.out.println("File does exist.");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist. "+e);
		}

	}

}
