package com.ioPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C://data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student) ois.readObject();
		System.out.println(student);
	}

}
