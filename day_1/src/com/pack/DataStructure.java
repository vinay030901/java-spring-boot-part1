package com.pack;

public class DataStructure {

	// TODO Auto-generated method stub
	private final static int Size = 15;
	private int[] arr = new int[Size];

	public DataStructure() {
		for (int i = 0; i < Size; i++)
			arr[i] = i;
	}

	public void getEven() {
		InnerDemo id = new InnerDemo();
		while (id.hasNext()) {
			System.out.println(id.getNext());
		}
	}

	private class InnerDemo {
		private int next = 0;

		public boolean hasNext() {
			return next <= Size - 1;
		}

		public int getNext() {
			int retValue = arr[next];
			next += 2;
			return retValue;
		}
	}
}