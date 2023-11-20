package com.mypro.MockitoApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalcTest {

	@Mock
	AddService addService;
	
	CalculatorService calculatorService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
//		addService = Mockito.mock(AddService.class);
	}

	@Test
	void testCalc() {
		calculatorService = new CalculatorService(addService);
		int data1 = 11, data2 = 12, expected = 23;
		Mockito.when(addService.calc(data1, data2)).thenReturn(expected);
		int actual = calculatorService.calc(data1, data2);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiply() {
		calculatorService = new CalculatorService(addService);
		int data1 = 11, data2 = 12, expected = 132;
		Mockito.when(addService.multiply(data1, data2)).thenReturn(expected);
		int actual = calculatorService.multiply(data1, data2);
		assertEquals(expected, actual);
	}
}
