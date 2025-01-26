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
	 * @param value the value to be added at the end of the list.
	 */
	public boolean add(int value) {
		Node node = new Node(value);
		Node current = head;
		if (head == null) {
			head = node;
			size++;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			size++;
		}
		
		return true;
	}
	
	/**
	 * Inserts the value at the head of the list. Always returns true.
	 * @param value the value to be added at the start of the list.
	 */
	public boolean addFirst(int value) {
		Node node = new Node(value, head);
		head = node;
		size++;
		return true;
	}
	
	/**
	 * Replaces the value at the head of the list.
	 * @param value the new value to be at the head of the list.
	 */
	public void replaceFirst(int value) {
		Node node = new Node(value);
		if (head != null) {
			Node temp = head.next;
			node.next = temp;
			head = node;
		} else {
			head = node;
			size++;
		}
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
	 * Returns the data in the element at index position
	 * @
	 */
	public int get(int index) {
		int i = 0;
		Node current = head;
		
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index of element must be >= 0 and < size of list.");
		}
		while (current != null && i < index) {
			current = current.next;
			i++;
		}
		return current.data;
	}
	
	/**
	 * Stores a new entry at the specified index and returns the old entry's value.
	 * @param index the index of the old entry that will be replaced
	 * @param entry the new entry
	 * @return the data of the previous entry that was replaced
	 */
	public int set(int index, int entry) {
		int i = 0;
		Node current = head;
		
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index of element must be >= 0 and < size of list.");
		}
		
		while (current != null && i < index) {
			current = current.next;
			i++;
		}
		int oldData = current.data;
		current.data = entry;
		
		return oldData;
	}
	
	/**
	 * Removes the entry at position index and returns it.
	 * @param index the index of the entry to be removed
	 * @return the data of the entry that was removed
	 */
	public int remove(int index) {
		return 0;
	}
	
	/**
	 * Searches for the target and returns the position of the first occurrence, or -1
	 * if it is not in the list.
	 * @param target the value to search for in the list
	 * @return the index of the target value if found, -1 if it is not found.
	 */
	public int indexOf(int target) {
		int index = 0;
		Node current = head;
		while (current != null) {
			if (current.data == target) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	
	/**
	 * Iterates through the list and prints each node's value to console.
	 */
	public void display() {
		Node current = head;
		System.out.print("[ ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("]\n");
	}
	
	/*
	 * OPTIMIZED HELPER METHODS TAKEN FROM TEXT
	 * 
	private void addFirst(int value) {
		head = new Node(value, head);
		size++;
	}
	
	private void addAfter(Node node, int value) {
		node.next = new Node(value, node.next);
		size++;
	}
	
	private Node getNode(int index) {
		Node node = head;
		for (int i = 0; i < index && node != null; i++) {
			node = node.next;
		}
		return node;
	}
	
	*/

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
