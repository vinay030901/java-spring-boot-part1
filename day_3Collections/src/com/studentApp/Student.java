package com.studentApp;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private int rno;
	private String name;
	private int marks;
	public Student(int rno, String name, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && rno == other.rno;
	}
	@Override
	public int compareTo(Student o) {
		return o.getRno() + this.getRno();
	}
	
}
