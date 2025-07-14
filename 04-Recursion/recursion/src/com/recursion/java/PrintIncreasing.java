package com.recursion.java;

public class PrintIncreasing {

	public static void main(String[] args) {

		// call recursive function
		printIncreasing(5);
	}

	public static void printIncreasing(int n) {

		// base case
		if (n == 0) {
			return;
		}

		// recursive call
		printIncreasing(n - 1);

		// execution statement
		System.out.println(n);
	}
}
