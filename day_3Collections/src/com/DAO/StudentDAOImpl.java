package com.DAO;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import com.studentApp.Student;

public class StudentDAOImpl implements studentDAO {

	@Override
	public Optional<Student> searchUser(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rno of student to search: ");
		int rno = sc.nextInt();
		for (Student s : arr) {
			if (s.getRno() == rno) {
				return Optional.of(s);
			}
		}
		return Optional.empty();
	}

	@Override
	public void addStudent(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student rno: ");
		int roll = sc.nextInt();
		System.out.println("Enter student name: ");
		String sname = sc.next();
		System.out.println("Enter student marks: ");
		int marks = sc.nextInt();

		arr.add(new Student(roll, sname, marks));
	}

	@Override
	public void removeStudent(ArrayList<Student> arr) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rno of student to remove: ");
		int rno = sc.nextInt();
		for (int i = 0; i < arr.size(); i++)
			if (arr.get(i).getRno() == rno) {
				arr.remove(i);
				System.out.println("Student removed.");
				return;
			}
		System.out.println("Student not found.");

	}

	@Override
	public void updateStudent(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rno of student to update: ");
		int rno = sc.nextInt();
		System.out.println("Enter the new details: ");
		System.out.println("Enter student rno: ");
		int roll = sc.nextInt();
		System.out.println("Enter student name: ");
		String sname = sc.next();
		System.out.println("Enter student marks: ");
		int marks = sc.nextInt();
		for (int i = 0; i < arr.size(); i++)
			if (arr.get(i).getRno() == rno) {
				arr.set(i, new Student(roll, sname, marks));
				System.out.println("Student details updated");
				return;
			}
		System.out.println("Student not found.");

	}

}
