package com.edubrudge.interview;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<ComparableDemo> {

	@Override
	public int compare(ComparableDemo o1, ComparableDemo o2) {
		// TODO Auto-generated method stub
		if(o1.getRating() < o2.getRating())
		{	
			return -1;
		}
		else if(o1.getRating() > o2.getRating())
		{
			return 1;
		}	
		else 
			return 0;
	}	

}
