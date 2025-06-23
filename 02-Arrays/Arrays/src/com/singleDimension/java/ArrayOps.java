package com.singleDimension.java;

import java.util.Scanner;

public class ArrayOps {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] input = takeInput();
		displayArr(input);
	}

	public static int[] takeInput() {

		System.out.println("What must be the size of array ? ");
		int nsize = sc.nextInt();
		int[] arr = new int[nsize];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element at index " + i + " :");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void displayArr(int[] arr) {
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
