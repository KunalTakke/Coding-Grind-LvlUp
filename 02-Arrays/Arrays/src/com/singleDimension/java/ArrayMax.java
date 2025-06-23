package com.singleDimension.java;

import java.util.Scanner;

public class ArrayMax {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// declaration
		int[] arr = new int[5];

		// initializing the arr
		int[] input = setArray();
		int res = getMax(input);
		System.out.println("The maximum element is " + res);
	}

	public static int[] setArray() {

		System.out.print("Enter the size of the array :");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter value for index " + i + " :");
			arr[i] = sc.nextInt();

		}

		return arr;
	}

	public static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
