package com.pack;
public class StaticDemo {

	private static int a=12,b;
	static {
		System.out.println("inside block");
		StaticDemo.show();
		b=a*12;
		StaticDemo.show();
	}
	static void show() {
		System.out.println("method called "+b);
	}

}
