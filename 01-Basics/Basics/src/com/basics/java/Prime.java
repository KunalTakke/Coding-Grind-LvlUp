package com.basics.java;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int i = 2;
		boolean isPrime = true;

		if (n == 1) {
			isPrime = false;
		} else {

			while (i < n) {

				if (n % i == 0) {
					isPrime = false;
				}
				i++;
			}
		}
		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
