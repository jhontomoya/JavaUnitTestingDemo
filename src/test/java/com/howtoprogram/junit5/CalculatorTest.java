package com.howtoprogram.junit5;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	 private Calculator calculator;
	 private Calculator calculatorMockito;

	@Test
	@DisplayName("Suma")
	void testSuma() {
		System.out.println("Prueba Suma");
		int a=6;
		int b=5;
		int r=11;
		calculator = new Calculator();
		assertEquals(r,calculator.Suma(a,b));
		System.out.println(calculator.Suma(a,b));
	}
	
	@Test
	@DisplayName("Resta")
	void testResta() {
		System.out.println("Prueba Resta");
		int a=5;
		int b=7;
		int r=-2;
		calculator = new Calculator();
		assertEquals(r,calculator.Resta(a,b));
		System.out.println(calculator.Resta(a,b));
	}
	
	@Test
	@DisplayName("Division")
	void testDivision() {
		System.out.println("Prueba Division");
		int a=10;
		int b=10;
		int r=1;
		calculator = new Calculator();
		assertEquals(r,calculator.Division(a, b));
		System.out.println(calculator.Division(a, b));
	}
	
	@Test
	@DisplayName("Multiplicacion")
	void testMultiplicacion() {
		System.out.println("Prueba Multiplicacion");
		int a=6;
		int b=5;
		int r=30;
		calculator = new Calculator();
		assertEquals(r,calculator.Multiplicacion(a, b));
		System.out.println(calculator.Multiplicacion(a, b));
	}
	
	
	@Test
	@DisplayName("Suma Mockito")
	void testSumaMockito() {
		System.out.println("Prueba Suma Mockito");
		int a=20;
		int b=20;
		int r=80;
		calculatorMockito = mock(Calculator.class);
		when(calculatorMockito.Suma(a, b)).thenReturn(80);	
		assertEquals(r,calculator.Suma(a,b));
		System.out.println(calculator.Suma(a,b));
	}
	
	@Test
	@DisplayName("Resta Mockito")
	void testRestaMockito() {
		System.out.println("Prueba Suma Mockito");
		int a=10;
		int b=5;
		int r=30;
		calculatorMockito = mock(Calculator.class);
		when(calculatorMockito.Resta(a, b)).thenReturn(80);	
		assertEquals(r,calculator.Resta(a,b));
		System.out.println(calculator.Resta(a,b));
	}
	
	@Test
	@DisplayName("Division Mockito")
	void testDivisionMockito() {
		System.out.println("Prueba Division Mockito");
		int a=10;
		int b=5;
		int r=100;
		calculatorMockito = mock(Calculator.class);
		when(calculatorMockito.Division(a, b)).thenReturn(80);	
		assertEquals(r,calculator.Division(a,b));
		System.out.println(calculator.Division(a,b));
	}
	
	@Test
	@DisplayName("Multiplicacion Mockito")
	void testMultiplicacionMockito() {
		System.out.println("Prueba Multiplicacion Mockito");
		int a=6;
		int b=10;
		int r=200;
		calculatorMockito = mock(Calculator.class);
		when(calculatorMockito.Multiplicacion(a, b)).thenReturn(80);	
		assertEquals(r,calculator.Multiplicacion(a,b));
		System.out.println(calculator.Multiplicacion(a,b));
	}
	

}
