package day6_threadDemo;

public class demo2 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		// it will print Thread[main(name of thread), 5(priority), main(group it belong
		// to)]
		thread.setName("new main");
		System.out.println(thread);
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread);
	}
}
