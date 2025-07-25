package com.recursion.java;

public class AllIndicesRecursion {

	public static void main(String[] args) {
		
		int[] arr = {3,8,1,8,8,4};
		
		// call the recursive function
		int[] res = getAllIndices(arr, 0, 8, 0);
		
		System.out.println("Indices are as follows: ");
		for(int x: res) {
			System.out.println(x);
		}
	}
	
	public static int[] getAllIndices(int[] arr, int si, int data, int count) {
		
		//base case 
		if(si == arr.length) {
			int[] res = new int[count]; // create new arr of size count
			return res;
		}
		// before call statement 
		int[] resArr = null;
		if(arr[si] == data) {
			resArr = getAllIndices(arr, si+1, data, count+1);
			
		}else {
			resArr = getAllIndices(arr, si+1, data, count);
			
		}
		
		// post call statement
		if(arr[si] == data) {
			resArr[count] = si;
			return resArr;
		}else {
			return resArr;
		}
		
	}

}
