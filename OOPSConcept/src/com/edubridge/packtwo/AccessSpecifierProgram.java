package com.edubridge.packtwo;

import com.edubridge.packone.AccessSpecifierDemo;

//import com.edubridge.packone.*;

public class AccessSpecifierProgram {

	public static void main(String[] args) {
		
		AccessSpecifierDemo obj = new AccessSpecifierDemo();
		
		/*atm_pn and per cannot be accessed into another class since we 
		 * declared them as private*/
		
		/*obj.atm_pn = 1234;
		 * method disp is private so cant be accessed
		 *obj.disp() */
		
		obj.email = "abc@xyz.com";
		obj.dispmail();
		
		/*dispper method cannot be accessed since its default and can 
		 * be accessed only in same package
		 * obj.per = 98.5f;.
		 * obj.dispmail()*/
	}
}
