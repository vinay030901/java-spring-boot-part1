package com.ioPackage;

import java.io.Serializable;

public class Student implements Serializable {

	private int id;
	private String name, email;
	private transient String city;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Student(int id, String name, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + "]";
	}

	

}
