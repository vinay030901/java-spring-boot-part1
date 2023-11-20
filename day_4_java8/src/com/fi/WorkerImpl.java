package com.fi;

public class WorkerImpl {
	public static void execute(Worker worker) {
		worker.doWork1();
	}

	public static void main(String[] args) {
		execute(new Worker() {

			@Override
			public void doWork1() {
				System.out.println("called.");

			}
		});
		execute(()->System.out.println("welcome"));
	}

}
