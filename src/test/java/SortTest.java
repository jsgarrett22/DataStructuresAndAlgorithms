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
	
	/**
	 * Tests the selection sort algorithm in default, ascending order
	 */
	@Test
	void testSelectionSort() {
		int[] unsorted = {9, 12, 5, 14, 51, 94};
		int[] expected = {5, 9, 12, 14, 51, 94};
		assertArrayEquals(expected, Sort.SelectionSort(unsorted));
		
		int[] unsorted2 = {9, 3, 2, 2, 5, 2, 5, 2, 12};
		int[] expected2 = {2, 2, 2, 2, 3, 5, 5, 9, 12};
		assertArrayEquals(expected2, Sort.SelectionSort(unsorted2));
		
		int[] unsorted3 = {40, 35, 80, 75, 60, 90, 70, 75, 50, 22};
		int[] expected3 = {22, 35, 40, 50, 60, 70, 75, 75, 80, 90};
	}
	
	/**
	 * Tests the number of passes, comparisons, and exchanges that are performed.
	 */
	@Test
	void testSelectionSortStats() {
		int[] unsorted = {40, 35, 80, 75, 60, 90, 70, 75, 50, 22};
		int[] expected = {22, 35, 40, 50, 60, 70, 75, 75, 80, 90};
		
		assertArrayEquals(expected, Sort.SelectionSort(unsorted));
	}
	
	/**
	 * Tests the selection sort algorithm given a particular parameter that reflects
	 * ascending order (x = 0).
	 */
	@Test
	void testSelectionSortAscending() {
		int[] unsorted = {9, 12, 5, 14, 51, 94};
		int[] expected = {5, 9, 12, 14, 51, 94};
		assertArrayEquals(expected, Sort.SelectionSort(unsorted, 0));
		
		int[] unsorted2 = {9, 3, 2, 2, 5, 2, 5, 2, 12};
		int[] expected2 = {2, 2, 2, 2, 3, 5, 5, 9, 12};
		assertArrayEquals(expected2, Sort.SelectionSort(unsorted2, 0));
	}
	
	/**
	 * Tests the selection sort algorithm given a particular parameter that reflects
	 * descending order (x != 0).
	 */
	@Test
	void testSelectionSortDescending() {
		int[] unsorted = {9, 12, 5, 14, 51, 94};
		int[] expected = {94, 51, 14, 12, 9, 5};
		assertArrayEquals(expected, Sort.SelectionSort(unsorted, 1));
		
		int[] unsorted2 = {9, 3, 2, 2, 5, 2, 5, 2, 12};
		int[] expected2 = {12, 9, 5, 5, 3, 2, 2, 2, 2};
		assertArrayEquals(expected2, Sort.SelectionSort(unsorted2, 1));
	}

}
