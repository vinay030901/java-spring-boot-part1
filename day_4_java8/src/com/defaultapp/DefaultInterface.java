package com.defaultapp;

public interface DefaultInterface {

	public void addUser();

	public default void defaultMethod() {
		System.out.println("hello vinay");
	}

	public static void defaultMethod1() { // static method cannot be overridden.
		System.out.println("hello second method.");
	}
}
