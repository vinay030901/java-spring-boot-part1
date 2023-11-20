package com.layer1;

public class Grading {

//	enum Grade {
//		A, B, C, D
//	}
	private char Grade;

	public char getGrade() {
		return Grade;
	}

	public void setGrade(char grade) {
		Grade = grade;
	}

	public Grading(char grade) {
		super();
		Grade = grade;
	}

	@Override
	public String toString() {
		return "Grading [Grade=" + Grade + "]";
	}
	
}
