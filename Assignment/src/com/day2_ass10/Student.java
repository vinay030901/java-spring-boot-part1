package com.day2_ass10;

public class Student {

	private int studentId;
	private String studentName;
	private char studentType;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public Student(char studentType, String fname, String lname) {
		super();
		this.studentName = fname + lname;
		this.studentType = studentType;
	}

	public Student() {
		super();
		
	}

}
