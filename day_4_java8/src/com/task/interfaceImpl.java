package com.task;

public class interfaceImpl implements inter1, inter2 {

	@Override
	public void method2() {
		System.out.println("method 2");

	}

	@Override
	public void method1() {
		System.out.println("method 2");

	}

	@Override
	public void common() {
		inter1.super.common();
	}

	public static void main(String[] args) {
		inter1 in1 = new interfaceImpl();
		inter2 in2 = new interfaceImpl();
		in1.common();
		in2.common();

	}

}
