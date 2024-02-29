package com.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		
		// Step 1 load jdbc driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 connection
		
		String url = "jdbc:mysql://localhost:3306/Management";
		String username = "root";
		String password = "root";
		
		//Step 3 call driver manager
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		System.out.println("Collect data from employee table");
		
		//object used from executing a static SQL stmt
		
		Statement s = conn.createStatement();
		
		String sql = "select * from employee";
		
		ResultSet r = s.executeQuery(sql);
		
		while(r.next())
		{
			int Id = r.getInt("Id");
			String Name = r.getString("Name");
			int Age = r.getInt("Age");
			
			System.out.println("Employee Name is : "+Id+"\nEmployee Name is : "+Name+"\nEmployee Age is : "+Age);
		}
		

	}

}
