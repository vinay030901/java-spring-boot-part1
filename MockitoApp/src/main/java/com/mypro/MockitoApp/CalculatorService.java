package com.mypro.MockitoApp;

public class CalculatorService {

	private AddService addService;

	public CalculatorService(AddService addService) {
		super();
		this.addService = addService;
	}

	public int calc(int a, int b) {
		return addService.calc(a, b);
	}

	public int multiply(int a, int b) {
		return addService.multiply(a, b);
	}
}
