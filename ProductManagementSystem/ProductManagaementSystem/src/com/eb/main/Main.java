package com.eb.main;

import java.util.Scanner;

import com.eb.dao.ProductDao;
import com.eb.pojo.Product;

public class Main {

	public static void main(String[] args) {

Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String n = s.next();
		
		System.out.println("Welcome to the Product data management : "+n);
		
		int ch = 0;
		do
		{
			System.out.println("Press 1 to Add Product.");
			System.out.println("Press 2 to Update Product.");
			System.out.println("Press 3 to Delete Product.");
			System.out.println("Press 4 to Read Product Records.");
			System.out.println("Press 5 to Exit.");
			System.out.println("Enter your choice.");
			ch = s.nextInt();
			
			switch(ch)
			{
			case 1 :
				System.out.println("Enter Product Name : ");
				String name = s.next();
				
				System.out.println("Enter Product Price : ");
				int price = s.nextInt();
				
				System.out.println("Enter Product Quantity : ");
				int qt = s.nextInt();
				
				Product pt = new Product(name, price, qt);
				boolean ans = ProductDao.insertProductData(pt);
				
				System.out.println("Data Inserted Successfully.");
			break;
			
			case 2 :
				System.out.println("Press 1 to Update Name : ");
				System.out.println("Press 2 to Update Price : ");
				System.out.println("Press 3 to Update Quantity : ");
				int val = s.nextInt();
				
				if(val == 1)
				{
					System.out.println("Enter the Name you want to update : ");
					String name1 = s.next();
					
					System.out.println("Enter Id : ");
					int id = s.nextInt();
					
					Product p1 = new Product();
					p1.setProductName(name1);
					
					boolean f = ProductDao.updateProductData(val, name1, id, p1);
					System.out.println("Name Data Updated Successfully.");		
				}
				
				else if(val == 2)
				{
					System.out.println("Enter the Price you want to update : ");
					int pp = s.nextInt();
					
					System.out.println("Enter Id : ");
					int id = s.nextInt();
					
					Product p1 = new Product();
					p1.setProductPrice(pp);
					
					boolean f = ProductDao.updateProductData(val, name, pp, pt);
					System.out.println("Phone Data Updated Successfully.");		
				}
				
				else if(val == 3)
				{
					System.out.println("Enter the Quantity you want to update : ");
					int qt1 = s.nextInt();
					
					System.out.println("Enter Id : ");
					int id = s.nextInt();
					
					Product p1 = new Product();
					p1.setProductQuantity(qt1);
					
					boolean f = ProductDao.updateProductData(val, qt1, id, p1);
					System.out.println("City Data Updated Successfully.");	
				}
				
				else
				{
					System.out.println("Data is Not Updated.");
				}
			break;
			
			case 3:
				System.out.println("Enter ID you want to Delete: ");
				
				int id = s.nextInt();
				
				StudentDao.deleteStudentData(id);
				
				System.out.println("ID is deleted.");
			break;
			
			case 4:
				StudentDao.showAllStudentData();
			break;
			
			case 5:
				System.out.println("Bye Bye.");
			break;
			
			default:
				System.out.println("Wrong Choice!");
			}
			
			
		}
		while(ch!= 5);
			{
			
			}

	}


	}

}
