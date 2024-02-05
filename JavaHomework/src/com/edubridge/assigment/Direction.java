package com.edubridge.assigment;

public enum Direction {
	
	NORTH(0), SOUTH(1), EAST(2), WEST(3);

	private int i;  //instance var
	Direction(int index)   //enum_construct()
	{
		i = index;
		
	}
	int displayIndex()  //method
	{
		return i;
	}

	public static void main(String[] args) {
		System.out.println(Direction.NORTH);
		System.out.println(Direction.EAST.displayIndex());
	}
	


}
