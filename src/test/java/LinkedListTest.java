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
	void replaceFirst() {
		LinkedList list = new LinkedList();
		// Test if head starts as null
		// Add 5 to first node
		list.replaceFirst(5);
		assertEquals(1, list.size());
		
		// Add 7 to second node
		assertTrue(list.add(7));
		assertEquals(2, list.size());
		
		// Add 9 to third node
		assertTrue(list.add(9));
		assertEquals(3, list.size());
		
		// Add 11 to fourth node
		assertTrue(list.add(11));
		assertEquals(4, list.size());
				
		// Add 13 to fifth node
		assertTrue(list.add(13));
		assertEquals(5, list.size());
		
		// ASSERT DISPLAY
		
		// Change first node to 20
		list.replaceFirst(20);
		assertEquals(5, list.size());
	}
	
	@Test
	void sizeTest() {
		LinkedList list = new LinkedList();
		assertEquals(0, list.size());
	}
	
}
