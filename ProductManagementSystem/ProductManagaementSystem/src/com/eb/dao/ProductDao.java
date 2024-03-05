package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.eb.database.CP;
import com.eb.pojo.Product;

public class ProductDao {
	
	public static boolean insertProductData(Product p)
	{
		try
		{
			boolean f = false;
			
			Connection conn = CP.createc();
			
			String query = "insert into student (pname, price, quantity) values(?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1,p.getProductName());
			ps.setInt(2,p.getProductPrice());
			ps.setInt(3,p.getProductQuantity());
			ps.executeUpdate();
			
			f = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}	
	
	public static boolean updateProductData(int val, int qt1, int id, Product p)
	{
		boolean f = false;
		//update name
		try
		{
			Connection conn = CP.createc();
			if(val == 1)
			{
				String query = "update student set pname = ? where pid = ?";
				
				PreparedStatement ps = conn.prepareStatement(query);
				
				ps.setString(1, p.getProductName());
				ps.setInt(2, id);
				
				ps.executeUpdate();
				f = true;
			}
	
		//update price
			else if(val == 2)
			{
				String query = "update student set price = ? where pid = ?";
			
				PreparedStatement ps = conn.prepareStatement(query);
			
				ps.setInt(1, p.getProductPrice());
				ps.setInt(2, id);
			
				ps.executeUpdate();
				f = true;
			}	
		
		//update quantity
			else if(val == 3)
			{
				String query = "update student set quantity = ? where pid = ?";
			
				PreparedStatement ps = conn.prepareStatement(query);
			
				ps.setInt(1, p.getProductQuantity());
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

	public static boolean deleteProductData(int Id)
	{
		boolean f = false;
		
		try
		{
			Connection conn = CP.createc();
			
			String query = "delete from product where pid = ?";
			
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

	public static void showAllProductData()
	{
		boolean f = false;
		
		try
		{
			Connection conn = CP.createc();
			
			String query = "select * from product";
			
			Statement s = conn.createStatement();
			
			ResultSet r = s.executeQuery(query);
			
			while(r.next())
			{
				int Id = r.getInt(1);
				String name = r.getString(2);
				int p = r.getInt(3);
				int q = r.getInt(4);
				
				System.out.println("Product Id is : "+Id+"\nProduct Name is : "+name+"\n  is : "
						+"\nProduct Price is : "+p+"\n  is : "
						+"\nProduct Quantity is : "+q);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}

