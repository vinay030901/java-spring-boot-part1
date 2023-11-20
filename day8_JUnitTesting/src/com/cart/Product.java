package com.cart;

public class Product {

	private double price;
	private String name;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + "]";
	}

}
