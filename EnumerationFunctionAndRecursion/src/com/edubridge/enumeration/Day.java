package com.edubridge.enumeration;

public enum Day {
	SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
	
	private int i;  //instance var
	Day(int index)   //enum_construct()
	{
		i = index;
		
	}
	int displayIndex()  //method
	{
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println(Day.SATURDAY);
		System.out.println(Day.MONDAY.displayIndex());
	}
}
