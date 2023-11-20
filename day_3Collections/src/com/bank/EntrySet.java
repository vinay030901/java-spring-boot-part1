package com.bank;

import java.util.HashSet;

public class EntrySet {

	public static void check(HashSet<String> values) {
		if (values.isEmpty())
			System.out.println("The set is empty");
		else
			System.out.println("Set elements are: " + values);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> values = new HashSet<>();
//		values.add("first");
//		values.add("second");
//		values.add("third");
		check(values);

	}

}
