package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.addAll(Arrays.asList("user", "summa", "puma", "arru", "abhay"));
		lst.stream().filter((s) -> s.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
		lst.stream().sorted().forEach(System.out::println);
		lst.stream().map((s) -> s.substring(0, 1).toUpperCase() + s.substring(1)).forEach(System.out::println);
		List<String> newList = lst.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(newList);
	}

}
