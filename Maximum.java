package com.Generic;

public class Maximum {

	 public static void main(String[] args) {
		String p = "banana";
		String q = "apple";
		String r = "mango";
		findMaximum(p,q,r);
	 }

	 private static void findMaximum(String p, String q, String r) {
		String max = p;
		if (q.compareTo(p)>0) {
			max = q;
	 }
		if (r.compareTo(max)>0) {
			max = r;
		}
	 System.out.println("Maximum of numbers are " +max);
	 }
}
