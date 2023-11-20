package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {

	public static void main(String[] args) {
		// q. create a list and filter all even numbers from list

		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(arr);

		arr.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		System.out.println(arr.stream().filter(i -> i % 2 == 1).collect(Collectors.toList()));
		
		System.out.println(arr.stream().map(i -> i * 2).collect(Collectors.toList()));
	}

}
