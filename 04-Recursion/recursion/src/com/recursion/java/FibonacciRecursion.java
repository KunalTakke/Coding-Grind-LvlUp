package com.recursion.java;

public class FibonacciRecursion {

	public static void main(String[] args) {

		int res = fibonacciRecursion(6);
		System.out.println("Fibonacci addition is " + res);
	}

	public static int fibonacciRecursion(int n) {

		// base case
		if (n == 1 || n == 0) {
			return n;
		}

		// recursive call
		int fib1 = fibonacciRecursion(n - 1);
		int fib2 = fibonacciRecursion(n - 2);
		
		// statement
		int intermediateResult = fib1 + fib2;

		return intermediateResult;
	}

}
