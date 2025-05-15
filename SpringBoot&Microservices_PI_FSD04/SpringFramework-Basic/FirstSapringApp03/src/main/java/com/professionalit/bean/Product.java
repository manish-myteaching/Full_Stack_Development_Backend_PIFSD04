package com.professionalit.bean;

public class Product {

	private int productId;
	private String productName;

	
    public Product(int productId, String productName) {
		System.out.println("Product object created");
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void getProduct() {
		System.out.println("Product List");
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}

}
