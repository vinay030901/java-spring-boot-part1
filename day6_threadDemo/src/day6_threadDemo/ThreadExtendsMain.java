package day6_threadDemo;

public class ThreadExtendsMain {

	public static void main(String[] args) {

		System.out.println("Main thread begins");
		ThreadClassExtend demo = new ThreadClassExtend();
		demo.start();
		
	}

}
