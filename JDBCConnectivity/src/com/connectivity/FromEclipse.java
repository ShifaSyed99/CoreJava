package com.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FromEclipse {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		// Step 1 load jdbc driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 connection
		
		String url = "jdbc:mysql://localhost:3306/emp";
		String username = "root";
		String password = "root";
		
		//Step 3 call driver manager
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		//System.out.println("Collect data from employee table");
		

		//object used from executing a static SQL stmt
		
		Statement s = conn.createStatement();
		
		System.out.println("Inserting data into table:");
		String sql1 = "Insert into employee values(105, 'Sammy', 50)";
		s.execute(sql1);
		System.out.println("Data is inserted.");
		
		System.out.println("Updating data into table:");
		String sql2 = "Update employee set name = 'Samara' where Id = 104 ";
		s.execute(sql2);
		System.out.println("Data is updated.");
		
		System.out.println("Deleting data from table:");
		String sql3 = "Delete from employee where Id = 106 ";
		s.execute(sql3);
		System.out.println("Data is deleted.");
		
		System.out.println("Collecting data from table:");
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
