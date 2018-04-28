package test;

import code.Fibonacci;
import code.utils;

public class FibonacciTest {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 1; i <= 10; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
		 	utils.print(resultado);
		}	
	}
	

}
