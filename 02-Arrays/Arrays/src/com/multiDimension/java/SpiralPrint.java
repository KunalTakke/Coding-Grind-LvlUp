package com.multiDimension.java;

public class SpiralPrint {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		printSpiral(arr);
	}

	public static void printSpiral(int[][] arr) {
		// There is switching in direction
		// 1. row to col
		// 2. in rows => left to right
		// 3. in col => up to down

		int top = 0;
		int bottom = arr.length - 1;
		int right = arr[top].length - 1;
		int left = 0;
		int count = (bottom + 1) * (right + 1); // total elements in the array
		int dir = 1;

		// main condition
		while (left <= right && top <= bottom) {

			if (count >= 0) {

				if (dir == 1) {

					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + " ");
						count--;
					}
					top++;
					dir = 2;
				}

				if (dir == 2) {

					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + " ");
						count--;
					}
					right--;
					dir = 3;
				}

				if (dir == 3) {

					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + " ");
						count--;
					}
					bottom--;
					dir = 4;
				}

				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + " ");
						count--;
					}
					left++;
					dir = 1;
				}

			}

		}

	}

}
