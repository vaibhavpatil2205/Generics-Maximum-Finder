package com.Generic;

public class Maximum {

public static void main(String[] args) {
	Integer a=7;
	Integer b=8;
	Integer c=9;
	findMaximum(a,b,c);
	}

	private static void findMaximum(Integer a, Integer b, Integer c) {
	Integer max = a;
	if (b.compareTo(a)>0) {
	max = b;
	}
	if (c.compareTo(max)>0) {
	max = c;
	}
	System.out.println("Maximum of numbers are " +max);
	}
}
