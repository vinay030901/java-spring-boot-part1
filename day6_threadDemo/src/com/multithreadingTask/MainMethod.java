package com.multithreadingTask;

public class MainMethod {

	public static void main(String[] args) {
		Childthread demo = new Childthread();
		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println("main thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {

		}
	}

}
