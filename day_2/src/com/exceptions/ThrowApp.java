package com.exceptions;

public class ThrowApp {
	public static void validateAge(int age) {
		if(age<18)
			throw new ArithmeticException("Age should be greater than 18. ");
		else
			System.out.println("cleared. ");
	}

}
