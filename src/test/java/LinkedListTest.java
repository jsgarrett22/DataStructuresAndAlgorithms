package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.garrett.list.LinkedList;

class LinkedListTest {

	@Test
	void sizeTest() {
		LinkedList list = new LinkedList();
		assertEquals(0, list.size());
	}

}
