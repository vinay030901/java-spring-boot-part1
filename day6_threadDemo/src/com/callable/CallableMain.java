package com.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
	public void runTest() {
		try {
			ExecutorService tExecute = Executors.newSingleThreadExecutor();
			System.out.println("Starting main  ");

			Future<String> future = tExecute.submit(new callableApp());
			Thread.sleep(1000);
			System.out.println("Result for Future");
			String result = future.get();
			System.out.println("the result is  " + result);
			tExecute.shutdown();
		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		CallableMain cm = new CallableMain();
		cm.runTest();
	}

}