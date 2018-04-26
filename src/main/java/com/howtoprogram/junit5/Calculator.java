package com.howtoprogram.junit5;

public class Calculator {
	
	public Calculator() {
		
	}
	
	int Suma(int a, int b) {
		int S;
		S = a+b;
		return S;
	}
	
	int Resta(int a, int b) {
		int R;
		R = a-b;
		return R;
	}
	
	int Division(int a, int b) {
		int D;
		if(b == 0)return 0;
		D = a/b;
		return D;
	}
	
	int Multiplicacion(int a, int b) {
		int M;
		M = a*b;
		return M;
	}
}
