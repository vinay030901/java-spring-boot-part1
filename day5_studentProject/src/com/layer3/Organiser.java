package com.layer3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import com.layer1.Grading;
import com.layer1.Shuttle;
import com.layer1.Student;
import com.layer2.Exam;
import com.layer2.School;

public class Organiser implements SchoolDAO {

	public static void main(String[] args) {
		Grading g = new Grading('A');
		Shuttle shuttle = new Shuttle("straight", 101, 100);
		Optional<Student> student1 = Optional.of(new Student(12, "vinay", Optional.of(g), Optional.of(shuttle)));
		Optional<Student> student2 = Optional.of(new Student(1, "abhay", Optional.of(g), Optional.of(shuttle)));
		ArrayList<Optional<Student>> arr = new ArrayList<>();
		arr.add(student2);
		arr.add(student1);
		Exam e = new Exam("toc", "eng", LocalDate.now(), arr);
		School s = new School("name", "addr", Optional.of(e));
		Organiser o = new Organiser();
		o.showData(Optional.of(s));
	}

	@Override
	public void showData(Optional<School> s) {
		System.out.println("School name: " + s.get().getSchoolName());
		System.out.println("School address: " + s.get().getAddress());
		s.flatMap(School::getExams).stream().flatMap(exam -> exam.getStudents().stream()).forEach(System.out::println);
	}

}
