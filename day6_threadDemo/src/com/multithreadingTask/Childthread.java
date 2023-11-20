package com.multithreadingTask;

public class Childthread implements Runnable {

	Thread thread;

	public Childthread() {
		// this means current thread and the other is name of thread
		thread = new Thread(this, "Child thread");
		thread.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {

		}
	}

}
