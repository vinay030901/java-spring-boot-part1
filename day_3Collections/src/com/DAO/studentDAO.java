package com.DAO;

import java.util.ArrayList;

import com.studentApp.Student;

public interface studentDAO {
	public Student searchUser(ArrayList<Student> arr);

	public void addStudent(ArrayList<Student> arr);

	public void removeStudent(ArrayList<Student> arr);

	public void updateStudent(ArrayList<Student> arr);
}