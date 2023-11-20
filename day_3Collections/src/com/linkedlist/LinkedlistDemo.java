package com.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import com.studentApp.Student;

public class LinkedlistDemo {

	public static void main(String[] args) {
		
		// gives more functionality than arraylist such as addFirst, removeFirst etc
		LinkedList<Student> al = new LinkedList<>();
		al.addFirst(new Student(101, "vinay", 90));
		al.addFirst(new Student(102, "abhay", 92));
//		System.out.println(al);
		
		// doesn't let you give duplicate values
		HashSet<Student> set = new HashSet<>();
		set.add(new Student(101, "vinay", 90));
		set.add(new Student(102, "abhay", 92));
		set.add(new Student(102, "abhay", 92));
		set.add(new Student(102, "abhay", 92));
		set.add(new Student(4, "Arun", 60));
//		System.out.println(set);
		
		
		// it will sort the value but need comparable defined
		TreeSet<Student> treeset = new TreeSet<>();
	
		treeset.add(new Student(101, "vinay", 90));
		treeset.add(new Student(102, "abhay", 92));
		treeset.add(new Student(102, "abhay", 92));
		treeset.add(new Student(102, "abhay", 92));
		treeset.add(new Student(4, "Arun", 60));
		System.out.println(treeset);

	}

}
