package com.products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(1, "Wireless Headphones", "electronics", 89.99));
		products.add(new Product(2, "Bluetooth Speaker", "accessories", 59.99));
		products.add(new Product(3, "Smartwatch", "electronics", 129.99));
		products.add(new Product(4, "Phone Case", "accessories", 19.99));
		products.add(new Product(5, "Laptop Charger", "electronics", 49.99));
		products.add(new Product(6, "Camera Lens", "accessories", 69.99));
		products.add(new Product(7, "Tablet", "electronics", 199.99));
		products.add(new Product(8, "Gaming Mouse", "accessories", 34.99));
		products.add(new Product(9, "External Hard Drive", "electronics", 79.99));
		products.add(new Product(10, "Smartphone", "yes", 299.99));

		List<Product> accessoriesProd = products.stream().filter(i -> i.getCategory().equals("accessories"))
				.collect(Collectors.toList());
		System.out.println(accessoriesProd);

		double mx = products.stream().filter(i -> i.getCategory().equals("accessories")).mapToDouble(i -> i.getPrice())
				.max().getAsDouble();
		System.out.println(mx);

		HashMap<String, Integer> mp1 = new HashMap<>();
		for (Product p : products) {
			mp1.put(p.getCategory(),
					((int) products.stream().filter(i -> i.getCategory().equals(p.getCategory())).count()));
		}
		System.out.println(mp1);

		HashMap<String, Double> mp2 = new HashMap<>();
		for (Product p : products) {
			mp2.put(p.getCategory(), ((double) products.stream().filter(i -> i.getCategory().equals(p.getCategory()))
					.mapToDouble(i -> i.getPrice()).average().getAsDouble()));
		}
		System.out.println(mp2);

		List<Product> sortedList = products.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		boolean check = products.stream().anyMatch(p -> p.getName().equals("Smartphone"));
		if (check)
			System.out.println("Product exist");
		else
			System.out.println("Product doesn't exist");
	}

}
