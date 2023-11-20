package com.task;

public interface inter1 {
	public void method1();

	public default void common() {
		System.out.println("this is default method and interface 1");
	}
}
