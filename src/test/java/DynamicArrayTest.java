package test.java;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.garrett.list.DynamicArray;

class DynamicArrayTest {

	/**
	 * Tests the default constructor for default values.
	 */
	@Test
	void testDynamicArray() {
		DynamicArray arr = new DynamicArray();
		assertNotNull(arr);
		assertEquals(0, arr.size());
		assertTrue(arr.isEmpty());
	}

	/**
	 * Tests passing in a custom capacity into the constructor.
	 */
	@Test
	void testDynamicArrayInt() {
		DynamicArray arr = new DynamicArray(10);
		assertNotNull(arr);
		assertEquals(0, arr.size());
		assertTrue(arr.isEmpty());
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new DynamicArray(-10));
	}

	@Test
	void testSize() {
		fail("Not yet implemented");
	}

	@Test
	void testAddObject() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	void testAddIntObject() {
		fail("Not yet implemented");
	}

	@Test
	void testClear() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	void testLastIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveRange() {
		fail("Not yet implemented");
	}

	@Test
	void testSet() {
		fail("Not yet implemented");
	}

}
