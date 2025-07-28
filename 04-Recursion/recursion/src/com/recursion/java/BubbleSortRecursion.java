package com.recursion.java;

public class BubbleSortRecursion {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 2, 4 };
		// call the recursive function
		bubbleSortRecursion(arr, 0, arr.length - 1);
		System.out.println("Sorted Array is: ");
		for (int x : arr) {
			System.out.println(x);
		}
	}

	public static void bubbleSortRecursion(int[] arr, int si, int li) {

		// base case
		if(li == 0) {
			return;
		}
		if (si == li) {
			bubbleSortRecursion(arr, 0, li - 1);
			return;
		}

		// finished one parse
		if (arr[si] > arr[si + 1]) {
			// swap
			int temp = arr[si];
			arr[si] = arr[si + 1];
			arr[si + 1] = temp;
			bubbleSortRecursion(arr, si + 1, li);
			return;
		} else {
			bubbleSortRecursion(arr, si + 1, li);
		}



	}

}
