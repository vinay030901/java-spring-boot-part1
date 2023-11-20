package com.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executer {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		RunnableApp rp = new RunnableApp();
		ex.execute(rp);
		ex.execute(rp);
		ex.execute(rp);
		ex.execute(rp);
		ex.execute(rp);
		
		ex.shutdown(); // no new tasks are taken after this, but those which are running will be served.
	}

}
