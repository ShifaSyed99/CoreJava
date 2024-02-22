package com.edubridge.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		//1.first method to use stream
          List<String>obj=Arrays.asList("shifa","sakshi","shreyash");
          obj.stream().filter(i ->i.length()>5).forEach(i->System.out.println(i));
          
          
         //second method
         Stream<Integer>obj1=Stream.of(11,22,33,44);
         
         //count
        System.out.println(obj1.count());	
        
        
	//limit
	obj.stream().limit(2).forEach(i->System.out.print(i+" "));
	System.out.println();
	
	//skip
	obj.stream().skip(1).forEach(i->System.out.print(i+" "));
	
	}

}
