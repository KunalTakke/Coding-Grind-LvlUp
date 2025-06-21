package com.function.java;

import java.util.Scanner;

public class DecimalToAnybase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sourcenum = sc.nextInt();
		int requiredbase = sc.nextInt();

		int result = decimalToAnybase(sourcenum, requiredbase);
		System.out.println("The equivalent base=>" + requiredbase + " no is: " + result);
	}

	public static int decimalToAnybase(int srcnum, int reqbase) {

		int result = 0;
		int multiplier = 1;
		while (srcnum != 0) {
			int lastDigit = srcnum % reqbase;
			result = result + (lastDigit * multiplier);
			multiplier = multiplier * 10;
			srcnum = srcnum / reqbase;
		}

		return result;
	}

}
