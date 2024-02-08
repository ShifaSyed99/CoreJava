package com.edubridge.interfacedemo.nestedinterface;
//nested interface

//outer interface
public interface Books {
	void sBooks();

	//inner interface
	interface StoryBooks{
		void sstBooks();
		
	}
}
