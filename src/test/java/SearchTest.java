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

	@Test
	void testBinarySearch() {
		fail("Not yet implemented");
	}

}
