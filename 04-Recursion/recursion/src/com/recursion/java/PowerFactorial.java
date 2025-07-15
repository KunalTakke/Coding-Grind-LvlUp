package com.recursion.java;

import java.util.Scanner;

public class PowerFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int x = sc.nextInt();
		System.out.println("Enter the power :");
		int n = sc.nextInt();

		// call the recursive function
		int res = powerRecursion(x, n);
		System.out.println(x + " raise to the power " + n + " is " + res);
	}

	public static int powerRecursion(int x, int n) {

		// base case
		if (n == 0) {
			return 1;
		}
		// recursive call
		int powerCall = powerRecursion(x, n - 1);
		int intermediateRes = powerCall * x;

		return intermediateRes;
	}

}
