package com.cart;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> arr;

	public ShoppingCart(ArrayList<Product> arr) {
		super();
		this.arr = arr;
	}

	public int getItemCount() {
		return arr.size();
	}

	public void addItem(Product product) {
		arr.add(product);
	}

	public boolean checkEmpty(ArrayList<Product> arr) {
		return arr.isEmpty();
	}

	public double sum(ArrayList<Product> arr) {
		return arr.stream().mapToDouble(i -> i.getPrice()).sum();
	}

	public void removeProduct(String name, ArrayList<Product> arr) throws ProductNotFoundException {
		for (int i = 0; i < arr.size(); i++)
			if (arr.get(i).getName() == name) {
				arr.remove(i);
				return;
			}
		throw new ProductNotFoundException("product is not present.");
	}
}
