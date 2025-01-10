package com.garrett.search;

public class Search {

	/**
	 * Implementation of a basic linear search for an array of integers.
	 * @param array the array to search.
	 * @return returns the index of the value being searched, otherwise it returns -1.
	 */
	public static int LinearSearch(int[] array, int target) {
		int size = array.length;
		for (int i = 0; i < size; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(int[] sortedArray, int target) {
		int left = 0;
		int right = sortedArray.length - 1;
		
		while (left <= right) {
			int midpoint = (left + right) / 2;
			
			if (sortedArray[midpoint] == target) {
				return midpoint;
			} else if (sortedArray[midpoint] < target) {
				left = midpoint + 1;
			} else {
				right = midpoint - 1;
			}
		}
		
		return -1;
	}
}
