package com.edubridge.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer b = new StringBuffer("");
		System.out.println(b.capacity());
		
		StringBuffer c = new StringBuffer("Shifa");
		System.out.println(c.capacity());
		
		StringBuffer c1 = new StringBuffer("Shifa");
		System.out.println(c.capacity());
		
		System.out.println("Syed "+c);
		
		String s1 = "EduBridge";
		StringBuffer d = new StringBuffer(s1.length()); //passing length of normal string
		System.out.println(d.capacity());//length of normal string
		
		/*System.out.println(s1.capacity());
		Capacity method not alowed for string*/
		
		StringBuffer e = new StringBuffer("Syed Shifa Masroor Ahmed");
		System.out.println(e.capacity());
		
		c = new StringBuffer(" ");
		System.out.println(c.capacity());
		
		System.out.println(c1.append(" Syed"));
		
		StringBuffer f = new StringBuffer("Edubridge");//0-8 indices
		System.out.println(f.charAt(1));
		f.setCharAt(9, 'z');
		System.out.println(f);
		
		/*as string is immutable we cant do modification
		 * sysout(s1.append(" India"))
		 */
		

	}

}
