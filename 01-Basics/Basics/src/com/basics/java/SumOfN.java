package com.basics.java;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("Sum of fist " + n + " natural numbers is " + sum);

	}

}
