package com.singleDimension.java;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 33, 55, 66, 77, 88, 99, 100 };

		int res = binarySearchArray(arr, 10);
		if (res == -1) {
			System.out.println("Element not found :(");
		} else {
			System.out.println("The Index of the element is at " + res);
		}
	}

	public static int binarySearchArray(int[] arr, int element) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > element) {
				high = mid - 1;
			} else if (arr[mid] < element) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
