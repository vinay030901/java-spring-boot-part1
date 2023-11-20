package day6_threadDemo;

public class ImplementsRunnableDemo implements Runnable {

	Thread thread;

	public ImplementsRunnableDemo() {
		// this means current thread and the other is name of thread
		thread = new Thread(this, "Child thread");
		thread.start();
		System.out.println("child thread is ready.");
		
	}

	@Override
	public void run() {
		System.out.println("child thread is running: " + Thread.currentThread().getName());
	}

}
