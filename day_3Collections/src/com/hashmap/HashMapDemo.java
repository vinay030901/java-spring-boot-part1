package com.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.studentApp.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<>();
		hm.put("vk", new Student(1, "Vinay", 90));
		hm.put("ak", new Student(2, "Abhay", 92));
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println(hm);

		HashMap<String, ArrayList<String>> hmap = new HashMap<>();
		hmap.put("India", new ArrayList<>(Arrays.asList("Indore", "Gurgaon")));
		hmap.put("USA", new ArrayList<>(Arrays.asList("Newyork city", "Nevada")));
		hmap.put("UK", new ArrayList<>(Arrays.asList("Birmingham", "London")));
		System.out.println(hmap);
	}

}
