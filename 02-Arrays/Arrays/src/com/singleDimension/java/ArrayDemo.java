package com.singleDimension.java;

public class ArrayDemo {

	public static void main(String[] args) {

		// declaration
		int[] arr = null;

		System.out.println(arr);

		// initialization
		arr = new int[5];
		System.out.println(arr);

		// get
		for (int x : arr) {
			System.out.println(x);
		}

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// get after setting
		for (int x : arr) {
			System.out.println(x);
		}

	}

}
