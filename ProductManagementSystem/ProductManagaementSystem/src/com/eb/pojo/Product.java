package com.eb.pojo;

public class Product {
	
	private int productId;
	private String productName;
	private int productPrice;
	private int productQuantity;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productprice) {
		this.productPrice = productprice;
	}
	
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productquantity) {
		this.productQuantity = productquantity;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productName, int productprice, int productquantity) {
		super();
		this.productName = productName;
		this.productPrice = productprice;
		this.productQuantity = productquantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productprice=" + productPrice
				+ ", productquantity=" + productQuantity + "]";
	}
	
	
}
