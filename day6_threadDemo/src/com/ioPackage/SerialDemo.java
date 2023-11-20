package com.ioPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) throws IOException {
		Student student = new Student(101, "vinay", "damn@gmail.com");
		FileOutputStream fos = new FileOutputStream("C://data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
	}

}
