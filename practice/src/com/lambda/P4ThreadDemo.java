package com.lambda;

public class P4ThreadDemo {

	public static void main(String[] args) {
		Runnable thread1 = () -> {
			// this is body of thread
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		Thread t = new Thread(thread1);
		t.start();
	}

}
