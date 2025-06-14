package com.dataType.java;

/*
 This question is good for testing knowledge of data type conversion
 */
public class FahrenheitToCelsius {

	public static void main(String[] args) {

		for (int i = 0; i <= 300; i += 20) {

			// formula for converting Fahrenheit to Celsius
			int f = i;
			int celsius = (int)((5 / 9.0) * (f - 32));
			System.out.println(f + "\t" + celsius);

		}

	}

}
