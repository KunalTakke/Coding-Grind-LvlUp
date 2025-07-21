package com.recursion.java;

public class LastIndexRecursion {

	public static void main(String[] args) {

		int[] arr = { 6, 8, 1, 1, 5 };
		// call the recursive function
		int res = lastIndexRecursion(arr, 0, 1);
		System.out.println(res);
	}

	public static int lastIndexRecursion(int[] arr, int si, int data) {

		// base case
		if (si == arr.length) {
			return -1;
		}

		// recursive call
		int intermediateRes = lastIndexRecursion(arr, si + 1, data);

		// falling stack statements
		if (intermediateRes == -1) {
			if (arr[si] == data) {
				return si;
			} else {
				return intermediateRes;
			}
		} else {
			return intermediateRes;
		}

	}

}
