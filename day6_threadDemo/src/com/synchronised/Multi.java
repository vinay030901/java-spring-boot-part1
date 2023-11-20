package com.synchronised;

class Multi extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i + Thread.currentThread().getName());
		}
	}

	public static void main(String args[]) {
		Multi t1 = new Multi();
		Multi t2 = new Multi();
		Multi t3 = new Multi();
		t1.start();

		try {
			t1.join(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();

		t3.start();

	}
}
