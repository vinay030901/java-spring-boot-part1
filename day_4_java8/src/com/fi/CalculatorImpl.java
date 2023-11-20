package com.fi;

public class CalculatorImpl {

	public static void execute(Calculator c, int a, int b) {
		c.calculate(a, b);
	}

	public static void main(String[] args) {
		int x=3,y=2;
		execute((a,b) -> System.out.println(a+b), x, y);
		

	}

}
