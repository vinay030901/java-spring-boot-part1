package com.cart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class cartTesting {

	ArrayList<Product> arr;
	ShoppingCart shop;

	@BeforeEach
	void setUp() throws Exception {
		arr = new ArrayList<>();
		arr.add(new Product(50000, "laptop"));
		arr.add(new Product(30000, "mobile"));
	}

//	@Test
//	void testShoppingCart() {
//		fail("Not yet implemented");
//	}

	@Test
	void testGetItemCount() {
		arr.add(new Product(3000, "watch"));
		shop = new ShoppingCart(arr);
		assertEquals(3, shop.getItemCount());
	}

	@Test
	void testIfEmpty() {
		arr.clear();
//		arr.removeAll(arr);
		shop = new ShoppingCart(arr);
		assertEquals(true, shop.checkEmpty(arr));
	}

	@Test
	void testRemove() {
		shop = new ShoppingCart(arr);
		try {
			shop.removeProduct("laptop", arr);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		assertEquals(1, arr.size());
	}

	@Test
	void testSum() {
		arr.add(new Product(3000, "watch"));
		shop = new ShoppingCart(arr);
		assertEquals(83000, shop.sum(arr));
	}

//	@Test
//	void testAddItem() {
//		fail("Not yet implemented");
//	}

}
