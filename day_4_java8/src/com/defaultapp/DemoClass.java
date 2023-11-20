package com.defaultapp;

public class DemoClass implements DefaultInterface {

	@Override
	public void addUser() {
		System.out.println("User added.");
	}

//	@Override
//	public void defaultMethod() {
//		System.out.println("Function changed.");
//	}

//	@Override
//	public void defaultMethod1() {
//		System.out.println("static method can't be overriden.");
//	}

	public static void main(String[] args) {
		DefaultInterface di = new DemoClass();
		di.addUser();
		di.defaultMethod();
		DefaultInterface.defaultMethod1();
	}
}
