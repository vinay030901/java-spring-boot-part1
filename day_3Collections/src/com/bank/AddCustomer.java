package com.bank;

import java.util.ArrayList;

public class AddCustomer {
	public void printCustomers(ArrayList<String> customers) {
		System.out.println("Customers are: ");
		for (String s : customers)
			System.out.println(s);
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("jack");
		list.add("Tabrez");
		list.add("Harry");
		list.add("Leezu");
	}

}
