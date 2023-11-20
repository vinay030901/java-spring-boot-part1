package com.synchronised;

public class PrintSyn {

	public static synchronized void print(String s1, String s2) {
		System.out.println(s1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
		System.out.println(s2);
	}
}
