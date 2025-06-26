package com.singleDimension.java;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element at index " + i + " :");
			arr[i] = sc.nextInt();
		}

		System.out.println("Your array is :");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();

		insertionSort(arr);
		System.out.println("Your array after insertion sort is :");
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

	public static void insertionSort(int[] arr) {

		for (int counter = 1; counter < arr.length; counter++) {

			int value = arr[counter];
			int j = counter - 1;
			while (j != -1 && arr[j] > value) {
				// shift
				arr[j + 1] = arr[j];

				j--;
			}
			arr[j + 1] = value;
		}

	}

}
