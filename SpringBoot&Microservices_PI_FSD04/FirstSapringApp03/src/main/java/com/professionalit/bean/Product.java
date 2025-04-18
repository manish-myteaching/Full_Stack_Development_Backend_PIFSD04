package com.professionalit.bean;

public class Product {

	private int productId;
	private String productName;

	public Product() {
		System.out.println("Product object created");
	}

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public void getProduct() {
		System.out.println("Product List");
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	

}
