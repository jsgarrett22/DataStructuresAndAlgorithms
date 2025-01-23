package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.garrett.list.LinkedList;

class LinkedListTest {

	@Test
	void defaultConstructorTest() {
		LinkedList list = new LinkedList();
		assertEquals(0, list.size());		// size should be given the default of zero
		assertEquals(-1, list.getFirst());	// the head should be set to the default value of null
	}
	
	@Test
	void addTest() {
		LinkedList list = new LinkedList();
		// add first value of 5
		assertTrue(list.add(5));
		assertEquals(1, list.size());
		assertEquals(5, list.getFirst());
		// add second value of 7
		assertTrue(list.add(9));
		assertEquals(2, list.size());
		assertEquals(5, list.getFirst());
	}
	
	@Test
	void sizeTest() {
		LinkedList list = new LinkedList();
		assertEquals(0, list.size());
	}
	
}
