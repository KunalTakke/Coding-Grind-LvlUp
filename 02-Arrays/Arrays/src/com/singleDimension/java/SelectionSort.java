package com.singleDimension.java;

import java.util.Scanner;

public class SelectionSort {

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

		selectionSort(arr);

		System.out.println("Array After Selection Sort is :");
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

	public static void selectionSort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			int min = counter;
			for (int j = counter + 1; j < arr.length; j++) {

				if (arr[min] > arr[j]) {
					min = j;
				}

			}
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;

		}
	}

}
