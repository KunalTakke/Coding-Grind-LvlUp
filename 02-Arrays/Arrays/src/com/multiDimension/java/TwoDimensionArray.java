package com.multiDimension.java;

import java.util.Scanner;

public class TwoDimensionArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = takeInput();
		display(arr);
	}

	private static int[][] takeInput() {

		System.out.print("Enter the no of rows in the array :");
		int rows = sc.nextInt();

		int[][] arr = new int[rows][];

		for (int i = 0; i < rows; i++) {

			System.out.print("Enter the no of cols for row  :");
			int cols = sc.nextInt();
			arr[i] = new int[cols];
			for (int j = 0; j < cols; j++) {

				System.out.println("Enter value for index " + i + "th row," + j + "th col:");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
