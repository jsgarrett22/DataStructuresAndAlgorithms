package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.garrett.search.Search;
import com.garrett.sort.Sort;

class SearchTest {

	/**
	 * Tests the construction of the Sort class to satisfy coverage.
	 */
	@Test
	void testSearch() {
		assertNotNull(new Search());
	}
	
	/**
	 * Tests the searching of a particular array value linearly.
	 */
	@Test
	void testLinearSearch() {
		int[] actual = {1, 2, 3, 4, 5, 8, 9, 10};
		int target = 1;
		int expected = 0;
		assertEquals(expected, Search.LinearSearch(actual, target));
		assertEquals(-1, Search.LinearSearch(actual, 22));
		assertEquals(2, Search.LinearSearch(actual, 3));
		assertEquals(7, Search.LinearSearch(actual, 10));
	}

	/**
	 * Tests the searching of a particular array value using traditional binary search.
	 */
	@Test
	void testBinarySearch() {
		int[] testArray = {1, 2, 3, 4, 5, 8, 9, 10};
		assertEquals(-1, Search.BinarySearch(testArray, -1));
		assertEquals(3, Search.BinarySearch(testArray, 4));
		assertEquals(7, Search.BinarySearch(testArray, 10));
	}
	
	/**
	 * Tests the searching of a particular array value using binary search recursively.
	 */
	@Test
	void testRecursiveBinarySearch() {
		int[] testArray = {1, 2, 3, 4, 5, 8, 9, 10};
		assertEquals(-1, Search.BinarySearch(testArray, -1, 0, testArray.length - 1));
		assertEquals(2, Search.BinarySearch(testArray, 3, 0, testArray.length - 1));
		assertEquals(7, Search.BinarySearch(testArray, 10, 0, testArray.length - 1));
		assertEquals(3, Search.BinarySearch(testArray, 4, 0, testArray.length - 1));
	}

}
