package day6_threadDemo;

public class demo1 {

	public static void main(String[] args) {
		try {
			System.out.println("welcome");
			Thread.sleep(1000);
			System.out.println("to");
			Thread.sleep(1000);
			System.out.println("java");
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}
}