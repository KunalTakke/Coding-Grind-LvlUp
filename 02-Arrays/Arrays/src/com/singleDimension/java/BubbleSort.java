package com.singleDimension.java;

import java.util.Scanner;

public class BubbleSort {

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
		
		bubbleSort(arr);
		
		System.out.println("Your array after bubble sort is :");
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public static void bubbleSort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1 ; counter++) {
			
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
			
			
		}

	}

}
