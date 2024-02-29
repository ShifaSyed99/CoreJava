package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.eb.database.CP;
import com.eb.pojo.Student;

public class StudentDao {
	
	public static boolean insertStudentData(Student s)
	{
		try
		{
			boolean f = false;
			
			Connection conn = CP.createc();
			
			String query = "insert into student (SName, SPhone, SCity) values(?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1,s.getStudentName());
			ps.setString(2,s.getStudentPhone());
			ps.setString(3,s.getStudentCity());
			ps.executeUpdate();
			
			f = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean updateStudentData(int val, String toUpdate, int id, Student s)
	{
		boolean f = false;
		//update name
		try
		{
			Connection conn = CP.createc();
			if(val == 1)
			{
				String query = "update student set SName=? where SId = ?";
				
				PreparedStatement ps = conn.prepareStatement(query);
				
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				
				ps.executeUpdate();
				f = true;
			}
			
			//update phone
			else if(val == 2)
			{
				String query = "update student set SPhone=? where SId = ?";
				
				PreparedStatement ps = conn.prepareStatement(query);
				
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				
				ps.executeUpdate();
				f = true;
			}	
			
			//update city
			else if(val == 3)
			{
				String query = "update student set SCity=? where SId = ?";
				
				PreparedStatement ps = conn.prepareStatement(query);
				
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				
				ps.executeUpdate();
				f = true;
			}
			
			else
			{
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean deleteStudentData(int Id)
	{
		boolean f = false;
		
		try
		{
			Connection conn = CP.createc();
			
			String query = "delete from student where SId = ?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1,Id);
			ps.executeUpdate();
			
			f = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;	
	}
	
	public static void showAllStudentData()
	{
		boolean f = false;
		
		try
		{
			Connection conn = CP.createc();
			
			String query = "select * from student";
			
			Statement s = conn.createStatement();
			
			ResultSet r = s.executeQuery(query);
			
			while(r.next())
			{
				int Id = r.getInt(1);
				String name = r.getString(2);
				String phone = r.getString(3);
				String city = r.getString(4);
				
				
				System.out.println("Student Id is : "+Id+"\nStudent Name is : "+name+"\n  is : "
						+"\nStudent Phone Number is : "+phone+"\n  is : "
						+"\nStudent City is : "+city);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
}
}
