package com.layer1;

import java.util.Optional;

public class Student {

	private int id;
	private String name;
	private Optional<Grading> grade;
	private Optional<Shuttle> shuttle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Grading> getGrade() {
		return grade;
	}

	public void setGrade(Optional<Grading> grade) {
		this.grade = grade;
	}

	public Optional<Shuttle> getShuttle() {
		return shuttle;
	}

	public void setShuttle(Optional<Shuttle> shuttle) {
		this.shuttle = shuttle;
	}

	public Student(int id, String name, Optional<Grading> grade, Optional<Shuttle> shuttle) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.shuttle = shuttle;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade.get() + ", shuttle=" + shuttle.get() + "]";
	}

}
