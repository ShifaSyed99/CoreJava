package com.edubridge.packone;

public class AccessSpecifierDemo {

	
		private int atm_pn;            //private var
		public String email;
		float per;
		
		private void dispatm()			//private mehod
		{
			System.out.println(atm_pn);
		}
		
		public void dispmail()			//private mehod
		{
			System.out.println(email);
		}
		
		void dispper()			//default mehod
		{
			System.out.println(per);
		}



	}


