package com.garrett.list;

public class LinkedList {

	private Node head;
	private int size;
	
	// default constructor
	public LinkedList() {}
	
	/**
	 * Returns the number of elements in the list.
	 * @return the number of elements of the list
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Adds an element to the end of the list. Always returns true.
	 */
	public boolean add(int value) {
		Node node = new Node(value);
		if (head == null) {
			addFirst(node.data);
		}
		return true;
	}
	
	/**
	 * Adds an element to the head of the list.
	 */
	public void addFirst(int value) {
		head = new Node(value, head);
		size++;
	}
	
	/**
	 * Returns the value of the first element of the list.
	 * @return the value of the first element of the list or -1 if the list is empty.
	 */
	public int getFirst() {
		if (head != null) {
			return head.data;
		} else {
			return -1;
		}
	}
	
	/**
	 * Nested data structure that contains the value of the node and a reference
	 * to the next node in the LinkedList.
	 */
	private class Node {
		
		int data;
		Node next;
		
		/**
		 * Creates a node given only a value and not a reference to a node next in the
		 * list.
		 * @param data the data value of the node
		 */
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		/**
		 * Creates a node given a particular value and an assigned reference to the next
		 * node, otherwise it is null, signifying the end of the LinkedList.
		 * @param data the data value of the node
		 * @param next the next node in the list, otherwise it is null
		 */
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
