package com.task;

public interface inter2 {
	
	public void method2();

	public default void common() {
		System.out.println("this is default method and interface 2");
	}
}
