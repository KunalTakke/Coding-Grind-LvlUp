package com.recursion.java;

public class IsSortedRecursion {

	public static void main(String[] args) {

		// call the recursive function
		int[] arr = { 1, 4, 4, 56, 88, 9 };
		boolean res = isSorted(arr, 0);
		System.out.println(res);
	}

	public static boolean isSorted(int[] arr, int si) {

		// base case
		if (si == arr.length - 1) {
			return true;
		}

		// statement for checking
		if (arr[si] > arr[si + 1]) {
			return false;
		}

		// recursive call
		boolean intermediateResult = isSorted(arr, si + 1);

		return intermediateResult;
	}

}
