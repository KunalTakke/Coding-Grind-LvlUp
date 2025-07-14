package com.recursion.java;

public class PrintDecreasingIncreasing {

	public static void main(String[] args) {

		// calling recursive function
		printDecreasingIncreasing(5);
	}

	public static void printDecreasingIncreasing(int n) {

		// base case
		if (n == 0) {
			return;
		}
		// statement execution when stack is building
		System.out.println(n);
		// recursive function call
		printDecreasingIncreasing(n - 1);

		// statement execution when stack is falling
		System.out.println(n);
	}

}
