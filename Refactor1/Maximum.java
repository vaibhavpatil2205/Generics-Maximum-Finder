package com.Generic;

import java.util.Comparator;

public class Maximum  <T extends Comparable<T>> {

	T num1;
	T num2;
	T num3;

	 public static void main(String[] args) {
   	  System.out.println("Maximum Int by creating Generic class :" + new Maximum(7, 8, 9).GenericMax());
   	  System.out.println("Maximum Float by creating Generic class :" + new Maximum(2.5f, 8.6f, 7.9f).GenericMax());
   	  System.out.println("Maximum Float by creating Generic class :" + new Maximum("banana","apple","mango").GenericMax());
   }

    public Maximum(T num1, T num2, T num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}


    public T GenericMax() {
    	return Maximum.GenericMax(num1, num2, num3);
    }


    public static <T extends Comparable<T>> T GenericMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }

}
