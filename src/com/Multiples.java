package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Multiples {
	static int number = 1000;
	static int[] multiples = new int[] { 3, 5 };
	static ArrayList<Integer> factors = new ArrayList<Integer>();
	static Set<Integer> factorSet = new HashSet<Integer>();
	static int sum = 0;

	/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	 * The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
	public static void main(String[] args) {
		for (int x : multiples) {
			hashStream(x, number);
		}
		calc();
		System.out.println(sum);	
	}

	
	public static void calc() {
		factorSet.addAll(factors);
		for (int key : factorSet) {
			sum += key;
		}
	}

	public static void hashStream(int x, int y) {
		for (int i = 0; i < y; i++) {
			if (i == 0)
				continue;

			if (i % x == 0) {
				factors.add(i);
			}
		}
	}
}
