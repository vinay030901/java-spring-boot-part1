package com.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
//			return;
		} finally {
			System.out.println("Program completed.");
		}
		System.out.println("hello ...");
	}

}
