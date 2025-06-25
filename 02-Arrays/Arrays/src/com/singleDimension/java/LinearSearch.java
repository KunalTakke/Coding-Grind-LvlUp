package com.singleDimension.java;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of elements in array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element at index " + i + " :");
			arr[i] = sc.nextInt();

		}

		System.out.print("Enter the element you want to find :");
		int query = sc.nextInt();

		int res = linearSearchElement(arr, query);
		System.out.println("Element is present at index :" + res);
	}

	public static int linearSearchElement(int[] arr, int element) {

		int idx = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == element) {
				System.out.println("Hit at index " + i);
				idx = i;
				return idx;
			}

		}

		return idx;
	}

}
