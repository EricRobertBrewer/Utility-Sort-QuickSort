package com.uberprinny.util.sort;

import java.util.Random;

public class Test {
	
	private static final int SIZE = 1000;

	public static void main(String[] args) {
		Random random = new Random();
		
		Integer[] original = new Integer[SIZE];
		Integer[] sorted = new Integer[SIZE];
		for (int i = 0; i < SIZE; i++) {
			original[i] = sorted[i] = random.nextInt(SIZE) - (SIZE / 2);
		}
		QuickSort.sort(sorted);
		
		System.out.println("Original values:");
		for (int i : original) {
			System.out.println(i);
		}
		System.out.println("Sorted values:");
		for (int i : sorted) {
			System.out.println(i);
		}
	}
}
