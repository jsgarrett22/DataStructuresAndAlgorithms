package com.garrett.list;

public class DynamicArray {

	private final int DEFAULT_CAPACITY = 10;
	
	public Object[] elements = {};
	private int capacity;
	private int size;
	
	/**
	 * Default Constructor with a default capacity.
	 */
	public DynamicArray() {
		this.elements = new Object[DEFAULT_CAPACITY];
		this.size = 0;
	}
	
	/**
	 * Constructor with a particular initial capacity.
	 * @param initialCapacity - the initial capacity for the array.
	 */
	public DynamicArray(int initialCapacity) {
		super();
			if (initialCapacity < 0) {		// if an initial capacity is less than zero, then throw illegal argument exception
				throw new IllegalArgumentException("Invalid Capacity" + initialCapacity);
			}
		capacity = initialCapacity;
		this.size = 0;        
		this.elements = new Object[capacity];
	}
	
	/**
	 * Returns the number of elements in the array.
	 * @return the number of elements in the array.
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Appends the specified element to the end of the array.
	 * @param o the object to be appended
	 * @return 
	 */
	public boolean add(Object o) {
		// TODO
		if (size == capacity) {
			throw new IllegalArgumentException("The capacity of the array is full." + this.size());
		} else {
			this.elements[size() - 1] = o;
			return false;
		}
	}
	
	/**
	 * Returns true if the array is empty, or false if it is not.
	 * @return true if the array is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return (size == 0) ? true : false;
	}
	
	/**
	 * Inserts the specified element at the specified position in the array.
	 * @param index
	 * @param o
	 */
	public void add(int index, Object o) {
		// TODO
		
	}
	
	/**
	 * Removes all of the elements from the array.
	 */
	public void clear() {
		
	}
	
	/**
	 * Compares the specified object with this array for equality.
	 */
	public boolean equals(Object o) {
		// TODO
		
		return false;
	}
	
	/**
	 * Returns the index of the first occurence of the specified element in this array, or -1 if this array does not contain the element.
	 * @param o - element to search for
	 * @return the index of the first occurence of the specified element in the array, or -1 if this lsit does not contain the element.
	 */
	public int indexOf(Object o) {
		return -1;
	}
	
	/**
	 * Returns the index of the last occurrence of the specified element in this array, or -1 if this array does not contain the element.
	 * @param o - element to search for
	 * @return the index of the last occurrence of the specified element in this array, or -1 if this array does not contain the element
	 */
	public int lastIndexOf(Object o) {
		return -1;
	}
	
	/**
	 * Removes the element at the specified position in this list (optional operation).
	 * @param index - the index of the element to be removed
	 * @return the element previously at the specified position
	 */
	public Object remove(int index) {
		return null;
	}
	
	/**
	 * Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 * @param fromIndex
	 * @param toIndex
	 * @return
	 */
	public Object removeRange(int fromIndex, int toIndex) {
		return null;
	}
	
	/**
	 * Replaces the element at the specified position in the array with the specified object.
	 * @param index of the element to replace
	 * @param element to be stored at the specified position
	 * @return the element previously at the specified position
	 */
	public Object set(int index, Object o) {
		return null;
	}

}
