package com.callable;

import java.util.concurrent.Callable;

public class callableApp implements Callable<String> {

	@Override
	public String call() {
		System.out.println("inside call method.");
		try {
			System.out.println(5000);
		} catch (Exception e) {

		}
		System.out.println("completed call method.");
		return "finished";
	}

}
