package com.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		// Step 1 load jdbc driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 connection
		
		String url = "jdbc:mysql://localhost:3306/pstmt";
		String username = "root";
		String password = "root";
		
		//Step 3 call driver manager
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		String sql = "insert into user(Id, Name, Location)values(?, ?, ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, 102);
		ps.setString(2, "Tom");
		ps.setString(3, "Mumbai");

		int i = ps.executeUpdate();

		/*PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, 102);
		ps.setString(2, "Tom");
		ps.setString(3, "Mumbai");*/
		
		CallableStatement cs = (CallableStatement) conn.prepareCall(sql);
		cs.setInt(1, 103);
		cs.setString(2, "John");
		cs.setString(3, "Delhi");
		
		cs.execute();

//		int i = ps.executeUpdate();
		System.out.println("Data inserted successfully");
		System.out.println("Data inserted successfully");
	}
	
}
