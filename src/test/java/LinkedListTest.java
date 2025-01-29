package test.java;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	void addSpecificIndexTest() {
		LinkedList list = new LinkedList();
		/* Try inserting at a particular index of an empty list */
		assertEquals(0, list.size());
		IndexOutOfBoundsException exceptionOne = assertThrows(IndexOutOfBoundsException.class, () ->
			list.add(4, 5));
		assertEquals(0, list.size());
		
		/* Try inserting a value, given a negative index */
		IndexOutOfBoundsException exceptionTwo = assertThrows(IndexOutOfBoundsException.class, () ->
			list.add(-1, 5));
		assertEquals(0, list.size());
		
		/* Try inserting a value, given an appropriate index on an empty list */
		list.add(0, 5);
		assertEquals(1, list.size());
		
		/* Try inserting a value, given an appropriate index on a populated list */
		list.add(7);
		list.add(9);
		list.add(11);
		list.add(2, 13);
		assertEquals(5, list.size());
		assertEquals(13, list.get(2));
		assertEquals(9, list.get(3));
		assertEquals(11, list.get(4));
	}
	
	@Test
	void addFirst() {
		LinkedList list = new LinkedList();
		// add first value of 5
		assertTrue(list.add(5));
		assertEquals(1, list.size());
		assertEquals(5, list.getFirst());
		// add second value of 7
		assertTrue(list.add(7));
		assertEquals(2, list.size());
		assertEquals(5, list.getFirst());
		// insert third value of 9 at the beginning
		assertTrue(list.addFirst(9));
		assertEquals(3, list.size());
		assertEquals(9, list.getFirst());
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
	void indexOfTest() {
		LinkedList list = new LinkedList();
		// check on an empty list
		assertEquals(-1, list.indexOf(5));
		
		// Add 5 to first node
		assertTrue(list.add(5));
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
		
		// Search for the index of value '5'
		assertEquals(0, list.indexOf(5));
		// Search for the index of value '7'
		assertEquals(1, list.indexOf(7));
		// Search for the index of value '9'
		assertEquals(2, list.indexOf(9));
		// Search for the index of value '11'
		assertEquals(3, list.indexOf(11));
		// Search for the index of value '13'
		assertEquals(4, list.indexOf(13));
	}
	
	@Test
	void getTest() {
		LinkedList list = new LinkedList();
		NullPointerException nullException = assertThrows(NullPointerException.class, () ->
		list.get(0));
		
		IndexOutOfBoundsException exceptionOne = assertThrows(IndexOutOfBoundsException.class, () ->
		list.get(-1));
		assertEquals("Index of element must be >= 0 and < size of list.", exceptionOne.getMessage());
		IndexOutOfBoundsException exceptionTwo = assertThrows(IndexOutOfBoundsException.class, () ->
		list.get(5));
		assertEquals("Index of element must be >= 0 and < size of list.", exceptionTwo.getMessage());
		
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		list.add(13);
		
		assertEquals(5, list.get(0));
		assertEquals(9, list.get(2));
		assertEquals(13, list.get(4));
	}
	
	@Test
	void setTest() {
		LinkedList list = new LinkedList();
		
		NullPointerException nullException = assertThrows(NullPointerException.class, () ->
		list.set(0, 5));
		
		IndexOutOfBoundsException exceptionOne = assertThrows(IndexOutOfBoundsException.class, () ->
		list.set(-1, 1));
		
		IndexOutOfBoundsException exceptionTwo = assertThrows(IndexOutOfBoundsException.class, () ->
		list.set(5, 10));
		assertEquals("Index of element must be >= 0 and < size of list.", exceptionTwo.getMessage());
		//IndexOutOfBoundsException exceptionThree = assertThrows(IndexOutOfBoundsException.class, () ->
		//list.set(5, 10));
		
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		list.add(13);
		
		assertEquals(5, list.set(0, 1));
		assertEquals(1, list.get(0));
		
		assertEquals(13, list.set(4, 20));
		assertEquals(20, list.get(4));
	}
	
	@Test
	void removeTest() {
		LinkedList list = new LinkedList();
		
		/* Remove from an empty list */
		assertEquals(0, list.remove(0));
		
		/* Try giving an index value < 0 */
		assertThrows(IndexOutOfBoundsException.class, () ->
		list.remove(-1));
		
		/* Try giving an index value > size */
		assertThrows(IndexOutOfBoundsException.class, () ->
		list.remove(100));
		
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		list.add(13);
		list.add(15);
		list.add(17);
		
		/* Try removing from beginning */
		assertEquals(5, list.remove(0));
		assertEquals(6, list.size());
		
		/* Try removing from the head again */
		assertEquals(7, list.remove(0));
		assertEquals(5, list.size());
		
		/* Try removing from middle */
		assertEquals(13, list.remove(2));
		assertEquals(4, list.size());
		
		/* Try removing from end */
		assertEquals(15, list.remove(2));
		assertEquals(3, list.size());
		
		/* Try removing from end */
		assertEquals(17, list.remove(2));
		assertEquals(2, list.size());
		
		/* Try removing from end again */
		assertEquals(11, list.remove(1));
		assertEquals(1, list.size());
		
		/* Try removing from end again again */
		assertEquals(9, list.remove(0));
		assertEquals(0, list.size());
		
	}
	
	@Test
	void sizeTest() {
		LinkedList list = new LinkedList();
		assertEquals(0, list.size());
	}
	
}
