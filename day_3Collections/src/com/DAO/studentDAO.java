package com.DAO;

import java.util.ArrayList;
import java.util.Optional;

import com.studentApp.Student;

public interface studentDAO {
	public Optional<Student> searchUser(ArrayList<Student> arr);

	public void addStudent(ArrayList<Student> arr);

	public void removeStudent(ArrayList<Student> arr);

	public void updateStudent(ArrayList<Student> arr);
}
