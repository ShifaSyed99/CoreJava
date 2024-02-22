package com.edubridge.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=Arrays.asList(22,34,56,67);
		Optional<Integer>res=obj.stream().reduce((x,y)->x*y);
		if(res.isPresent())
			System.out.println(res.get());
		else
			System.out.println("not present");

	}

}
