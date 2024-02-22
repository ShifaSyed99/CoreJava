package com.edubridge.streamapi;
	
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class StringToUpperCaseDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<String>obj=Arrays.asList("shifa","sakshi","shreyash");
			String res=obj.stream().map(i ->i.toUpperCase()).collect(Collectors.joining(","));
			System.out.println(res);
			
		}

	}


