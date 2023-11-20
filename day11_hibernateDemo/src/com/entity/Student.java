package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int rno;
	private String name;
	private String cls;
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
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public Student(int rno, String name, String cls) {
		super();
		this.rno = rno;
		this.name = name;
		this.cls = cls;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", cls=" + cls + "]";
	}
	
	
}
