package com.products;

public class Product implements Comparable<Product> {

	public int id;
	public double price;
	public String name, category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Product(int id, String name, String category, double d) {
		super();
		this.id = id;
		this.price = d;
		this.name = name;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Product o) {
		return (int) (this.getPrice() - o.getPrice());
	}

}
