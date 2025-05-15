package com.professionalit.bean;

import java.util.List;

public class Customer {
	private int customerId; // primitive
	private String customerName; // Reference
	private String contantNumber; // Reference

	private List<Product> listProduct;
	private Address address; // Reference

	public Customer(int customerId, String customerName, String contantNumber, Address address,List<Product> listProduct) {
		System.out.println("customer object created");
		this.customerId = customerId;
		this.customerName = customerName;
		this.contantNumber = contantNumber;
		this.address = address;
		this.listProduct=listProduct;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contantNumber="
				+ contantNumber + ", listProduct=" + listProduct + ", address=" + address + "]";
	}

	

}
