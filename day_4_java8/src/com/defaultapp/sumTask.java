package com.defaultapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumTask {

	public static void sum(List<Integer> arr) {
		int sum = 0;
		for (Integer i : arr)
			if (i > 10)
				sum += i;
		System.out.println(sum);
	}

	public static int sum2(List<Integer> arr) {
		return arr.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(Arrays.asList(11, 12, 13, 5, 6, 7));
		sum(arr);
		System.out.println(sum2(arr));
	}

}
