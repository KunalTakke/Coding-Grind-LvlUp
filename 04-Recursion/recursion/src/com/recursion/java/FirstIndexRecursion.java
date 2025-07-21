package com.recursion.java;

public class FirstIndexRecursion {

	public static void main(String[] args) {

		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };

		// calling the recursive function
		int res = firstIndex(arr, 0, 7);
		System.out.println(res);
	}

	public static int firstIndex(int[] arr, int si, int data) {

		// base case
		if (si == arr.length) {
			return -1;
		}

		// statement to check
		if (arr[si] == data) {
			return si;
		}

		int intermediateResult = firstIndex(arr, si + 1, data);
		return intermediateResult;
	}

}
