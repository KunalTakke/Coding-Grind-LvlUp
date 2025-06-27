package com.singleDimension.java;

public class LowerBoundSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 4 };
		int ele = 3;
		int res = lowerBoundArray(arr, ele);

		System.out.println("The lower bound index for " + ele + " is " + res);
	}

	public static int lowerBoundArray(int[] arr, int element) {

		int low = 0;
		int high = arr.length - 1;
		int ans = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > element) {
				high = mid - 1;
			} else if (arr[mid] < element) {
				low = mid + 1;
			} else {
				ans = mid;
				high = mid - 1;
			}

		}

		return ans;

	}

}
