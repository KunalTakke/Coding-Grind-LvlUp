package com.recursion.java;

public class PrintDecreasingIncreasingSkip {

	public static void main(String[] args) {

		// calling the recursive function
		printDecreasingIncreasingSkip(5);

	}

	public static void printDecreasingIncreasingSkip(int n) {

		// base case
		if (n == 0) {
			return;
		}

		// execute statement while stack is building
		if (n % 2 != 0) {
			System.out.println(n);
		}
		printDecreasingIncreasingSkip(n - 1);

		// execute statement while stack is falling
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}
}
