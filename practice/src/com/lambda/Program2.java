package com.lambda;

public class Program2 implements Program2InterSum {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Program2InterSum s = (a, b) -> a + b;
		System.out.println(s.sum(2, 3));
	}

}
