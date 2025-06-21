package com.function.java;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int srcnum = sc.nextInt();
		int srcbase = sc.nextInt();

		int result = anyBaseToDecimal(srcnum, srcbase);

		System.out.println("The Decimal equivalent is :" + result);

	}

	public static int anyBaseToDecimal(int sourcenum, int sourcebase) {
		int decimalEquivalent = 0;
		int multiplier = 1;
		while (sourcenum != 0) {
			int lastDigit = sourcenum % 10;
			decimalEquivalent = decimalEquivalent + lastDigit * multiplier;
			multiplier = multiplier * sourcebase;
			sourcenum = sourcenum / 10;
		}
		return decimalEquivalent;
	}

}
