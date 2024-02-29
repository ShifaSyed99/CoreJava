package com.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Posts {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		// Step 1 load jdbc driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 connection
		
		String url = "jdbc:mysql://localhost:3306/conn";
		String username = "root";
		String password = "root";
		
		//Step 3 call driver manager
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		System.out.println("Collect data from posts table");
		

		//object used from executing a static SQL stmt
		
		Statement s = conn.createStatement();
		
		String sql = "select * from posts";
		
		ResultSet r = s.executeQuery(sql);
		
		while(r.next())
		{
			int Id = r.getInt("Id");
			String Name = r.getString("name");
			String Comments = r.getString("Comments");
			
			System.out.println("Posts Name is : "+Id+"\nPosts Name is : "+Name+"\nPosts Comments is : "+Comments);
		}

	}

}
