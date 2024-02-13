package com.edubridge.equalsmethoddemo;

public class SiteExec {

	public static void main(String[] args) {

		String s1 = "Create";
		String s2 = "Create";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = new String("Create");
		String s4 = new String("Create");
		System.out.println(s3.equals(s3));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		Site st1 = new Site("Create", 1);
		Site st2 = new Site("Create", 1);
		System.out.println(st1.equals(st2));
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());

	}

}
