package com.studentApp;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import com.DAO.StudentDAOImpl;
import com.DAO.studentDAO;

public class StudentMain {
	private static ArrayList<Student> arr = new ArrayList<Student>();
	static {

		arr.add(new Student(1, "Vinay", 90));
		arr.add(new Student(2, "Aditya", 80));
		arr.add(new Student(3, "Abhay", 70));
		arr.add(new Student(4, "Arun", 60));
		arr.add(new Student(5, "Sumit", 92));
	}

	public static int sumMarks(ArrayList<Student> arr) {
		return arr.stream().mapToInt(mark -> mark.getMarks()).sum();
	}

	public static void main(String[] args) {
		studentDAO st = new StudentDAOImpl();
//		st.addStudent(arr);
//		st.removeStudent(arr);
//		st.updateStudent(arr);
		System.out.println(sumMarks(arr));
		Optional<Student> std = st.searchUser(arr);
		if (std.isPresent()) {
			Student s = std.get();
			System.out.println("User found: " + s.getName());
		} else
			System.out.println("User not found");
//		for (Student s : arr)
//			System.out.println(s);
	}

}
