package com.singleDimension.java;

public class ArraySwap1 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int i = 0;
		int j = 2;
		System.out.println("Before Swapping " + arr[i] + " " + arr[j]);
		arrSwap(arr, i, j);
		System.out.println("After Swapping " + arr[i] + " " + arr[j]);
	}

	public static void arrSwap(int[] arr, int one, int two) {
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;

	}

}
