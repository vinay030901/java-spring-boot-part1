package day8_JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.Timeout;

public class CalculatorTesting {

	int i;
	static Calculator cal;
	CountDownLatch gt = new CountDownLatch(1);

	@Rule
	public Timeout tout = Timeout.seconds(20);
	public static String log;

	@Test(timeout = 5000)
	public void testOne() throws InterruptedException {
		log += "r-1";
//		TimeUnit.SECONDS.sleep(10);
	}

	@Test
	public void testTwo() throws Exception {
		Thread t = new Thread();
		//t.sleep(1000);
		t.start();
		log += "r-2";
		gt.await();
		t.stop();
	}

//	@BeforeAll
//	public static void callBeforeAll() {
//		cal = new Calculator();
//		System.out.println(cal.hashCode());
//	}
//
//	@AfterAll
//	public static void callAfterAll() {
//		System.out.println("Exit");
//	}
//
//	@BeforeEach
//	public void callBefore() {
//		i = 1;
//		i++;
//		System.out.println("function called before.");
//		System.out.println(i);
//		System.out.println(cal.hashCode());
//	}
//
//	@AfterEach
//	public void callAfter() {
//		System.out.println("called after every test.");
//	}
//
//	@Test
//	void testCalculate() {
//		assertEquals(10, cal.calculate(5, 5));
//	}
//
//	@Test
//	void testMultiply() {
//		assertEquals(25, cal.multiply(5, 5));
//	}
//
//	@Test
//	void testDivide() {
//		assertEquals(1, cal.divide(5, 5));
//	}

}
