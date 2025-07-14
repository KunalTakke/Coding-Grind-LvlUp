package com.recursion.java;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// call recursive function
		printDecreasing(5);
	}

	public static void printDecreasing(int n) {

		// base case
		if (n == 0) {
			return;
		}
		// statement to be executed
		System.out.println(n);
		
		// recursive call
		printDecreasing(n - 1);

	}

}
