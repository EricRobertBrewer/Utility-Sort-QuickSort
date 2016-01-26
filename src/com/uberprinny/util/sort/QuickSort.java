package com.uberprinny.util.sort;

public class QuickSort {
	
	private QuickSort() {
	}

	/**
	 * Sorts the entire array.
	 * @param array
	 */
	public static <T extends Comparable<T>> void sort(T[] array) {
		sort(array, 0, array.length-1);
	}
	
	/**
	 * Sorts an array using the quick sort algorithm - in O(n*log(n)) time.
	 * @param array
	 * @param low
	 * @param high
	 */
	public static <T extends Comparable<T>> void sort(T[] array, int low, int high) {
		if (low >= high) {
			return;
		}
		
		T pivot = array[low];
		int front = low+1, back = high;
		while (front < back) {
			if (array[front].compareTo(pivot) < 0) {
				front++;
			} else {
				T temp = array[back];
				array[back] = array[front];
				array[front] = temp;
				back--;
			}
		}
		if (pivot.compareTo(array[front]) < 0) {
			front--;
		}
		array[low] = array[front];
		array[front] = pivot;
		
		sort(array, low, front-1);
		sort(array, back, high);
	}
}
