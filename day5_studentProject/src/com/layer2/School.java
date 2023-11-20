package com.layer2;

import java.util.Optional;

public class School {

	private String schoolName, address;
	private Optional<Exam> exams;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Optional<Exam> getExams() {
		return exams;
	}

	public void setExams(Optional<Exam> exams) {
		this.exams = exams;
	}

	public School(String schoolName, String address, Optional<Exam> exams) {
		super();
		this.schoolName = schoolName;
		this.address = address;
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", address=" + address + ", exams=" + exams.get() + "]";
	}

}
