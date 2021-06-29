package com.Generic;

public class Maximum {

	 public static void main(String[] args) {

		Float x = 2.5f;
		Float y = 8.6f;
		Float z = 7.9f;
		findMaximum(x,y,z);

	}

	 private static void findMaximum(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(x)>0) {
			max = y;
	}
		if (z.compareTo(max)>0) {
			max = z;
	}
	 System.out.println("Maximum of numbers are " +max);

	}
