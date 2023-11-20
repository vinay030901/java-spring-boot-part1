package com.executers;

public class RunnableApp implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println("name " + i);
			}
		} catch (InterruptedException e) {

		}
		System.out.println("run called");
	}

}
