package com.mypro.MockitoApp;

public class AddServiceImpl implements AddService {

	@Override
	public int calc(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int multiply(int n1, int n2) {
		return n1 * n2;
	}
}
