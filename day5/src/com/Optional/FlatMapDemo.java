package com.Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> p1 = Arrays.asList("p1", "p2", "p3");
		List<String> p2 = Arrays.asList("p4", "p5", "p6");
		List<String> p3 = Arrays.asList("p7", "p8", "p9");
		List<List<String>> ap = new ArrayList<List<String>>();
		ap.add(p1);
		ap.add(p2);
		ap.add(p3);

		// without using flatmap
		List<String> allproducts = new ArrayList<String>();
//		for (List<String> pro : ap) {
//			allproducts.addAll(pro);
//		}
//		System.out.println(allproducts);

		// with flatmap
		List<String> flatmap = ap.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());
		System.out.println(flatmap);

		System.out.println(new ArrayList<>(
				Arrays.asList(Arrays.asList(21, 32, 63), Arrays.asList(11, 82, 37), Arrays.asList(18, 20, 67))).stream()
				.flatMap(ilist -> ilist.stream()).collect(Collectors.toList()));

	}

}
