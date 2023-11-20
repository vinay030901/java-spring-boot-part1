package com.layer2;

import java.util.ArrayList;
import java.util.Optional;
import java.time.LocalDate;
import com.layer1.Student;

public class Exam {

	private String examName, subject;
	LocalDate examDate;
	ArrayList<Optional<Student>> students;

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public LocalDate getExamDate() {
		return examDate;
	}

	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}

	public ArrayList<Optional<Student>> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Optional<Student>> students) {
		this.students = students;
	}

	public Exam(String examName, String subject, LocalDate examDate, ArrayList<Optional<Student>> students) {
		super();
		this.examName = examName;
		this.subject = subject;
		this.examDate = examDate;
		this.students = students;
	}

	@Override
	public String toString() {
		return "Exam [examName=" + examName + ", subject=" + subject + ", examDate=" + examDate + ", students="
				+ students + "]";
	}

}
