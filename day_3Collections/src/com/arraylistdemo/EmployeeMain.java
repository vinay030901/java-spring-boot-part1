package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> arr = new ArrayList<Employee>();

		arr.add(new Employee(101, "Vinay", "Dehradun"));
		arr.add(new Employee(102, "Abhay", "Delhi"));
		arr.add(new Employee(103, "Aditya", "Faridabad"));
		arr.add(new Employee(104, "Amish", "Barielly"));
		arr.add(2, new Employee(105, "Arun", "Haryana"));

//		System.out.println(arr.get(0));
//		arr.remove(3);

		Collections.sort(arr, (e1, e2) -> {
			return e1.getEmpId() - e2.getEmpId();
		});
//		Collections.reverse(arr);

		for (Employee e : arr)
			System.out.println(e);

		System.out.println(arr);
	}
}