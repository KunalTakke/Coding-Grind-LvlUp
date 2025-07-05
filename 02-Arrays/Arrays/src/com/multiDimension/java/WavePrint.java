package com.multiDimension.java;

public class WavePrint {

	public static void main(String[] args) {

		// declare and initialize an array
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		// call the function
		printWavePatter(arr);
	}

	public static void printWavePatter(int[][] arr) {

		int top = 0;
		int left = 0;
		int right = arr[top].length - 1;
		int bottom = arr.length - 1;
		int count = (right + 1) * (bottom + 1); // total count
		int dir = 1;

		while (left <= right && top <= bottom) {
			if (count > 0) {

				if (dir == 1) {

					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + " ");
					}
					top++;
					dir = 2;
				}

				if (dir == 2) {

					for (int i = right; i >= left; i--) {
						System.out.print(arr[top][i] + " ");
					}
					top++;
					dir = 1;
				}

			}

		}
	}

}
