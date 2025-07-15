package com.recursion.java;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number for which you want factorial ?");
		int num = sc.nextInt();

		// call the recursive function
		int res = factorialRecursion(num);
		System.out.println("Factorail of " + num + " is " + res);
	}

	public static int factorialRecursion(int n) {

		// base case
		if (n == 0) {
			return 1;
		}
		int factorialCall = factorialRecursion(n - 1);
		int factorial = factorialCall * n;
		return factorial;
	}

}
