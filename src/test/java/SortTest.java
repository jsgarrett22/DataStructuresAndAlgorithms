package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.garrett.sort.Sort;

class SortTest {
	
	/**
	 * Tests the construction of the Sort class to satisfy coverage.
	 */
	@Test
	void testSort() {
		assertNotNull(new Sort());
	}
	
	/**
	 * Tests the default implementation of the bubble sort algorithm.
	 */
	@Test
	void testBubbleSort() {
		int[] unsorted = {9, 12, 5, 14, 51, 94};
		int[] expected = {5, 9, 12, 14, 51, 94};
		assertArrayEquals(expected, Sort.BubbleSort(unsorted));
	}

	/**
	 * Tests the bubbleSort algorithm using the ascending order flag.
	 */
	@Test
	void testBubbleSortAscending() {
		int[] unsorted = {9, 12, 5, 14, 51, 94};
		int[] expected = {5, 9, 12, 14, 51, 94};
		assertArrayEquals(expected, Sort.BubbleSort(unsorted, 0));
		
		int[] unsorted2 = {9, 3, 2, 2, 5, 2, 5, 2, 12};
		int[] expected2 = {2, 2, 2, 2, 3, 5, 5, 9, 12};
		assertArrayEquals(expected2, Sort.BubbleSort(unsorted2, 0));
	}
	
	/**
	 * Tests the bubbleSort algorithm using the descending order flag.
	 */
	@Test
	void testBubbleSortDescending() {
		int[] unsorted = {9, 12, 5, 14, 51, 94};
		int[] expected = {94, 51, 14, 12, 9, 5};
		assertArrayEquals(expected, Sort.BubbleSort(unsorted, 1));
		
		int[] unsorted2 = {9, 3, 2, 2, 5, 2, 5, 2, 12};
		int[] expected2 = {12, 9, 5, 5, 3, 2, 2, 2, 2};
		assertArrayEquals(expected2, Sort.BubbleSort(unsorted2, 1));
	}

}
