package com.basics.java;

public class SimpleInterest {

	public static void main(String[] args) {
		
		int principle = 1000;
		int rate = 5; // 5%
		int time = 2; // years
		
		int simpleInterest = (principle * rate * time)/100;
		
		System.out.println("Simple interest is "+simpleInterest);
		
	}

}
