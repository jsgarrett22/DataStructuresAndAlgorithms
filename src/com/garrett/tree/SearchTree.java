package com.garrett.tree;

/**
 * Interface for a tree collection that contains search, insertion, and
 * deletion behavior: Taken from the text:
 * Data Structures Abstraction and Design Using Java. Fourth Edition: by
 * Elliot B. Koffman and Paul A. T. Wolfgang
 * @author Joshua S. Garrett
 * @version Feb 10th, 2025
 * @param <E>
 */
public interface SearchTree<E> {
	
	/**
	 * Inserts a item where it belongs in the tree.
	 * @param item the new item to insert
	 * @return Returns true if the item is inserted, otherwise, false if it
	 * already exists in the tree.
	 */
	public boolean add(E item);
	
	/**
	 * Returns true if target is found in the tree, otherwise false if it is
	 * not found.
	 * @param target
	 * @return
	 */
	public boolean contains(E target);
	
	/**
	 * Returns a reference to the data in the node that is equal to the
	 * particular target. If the target doesn't exist, returns null.
	 * @param target the target element to search for.
	 * @return the reference to the data if found, null if not found.
	 */
	public E find(E target);
	
	/**
	 * Removes the target from the tree.
	 * @param target the target element to delete and return.
	 * @return the reference to the deleted element if found, otherwise null
	 * if not found.
	 */
	public E delete(E target);

	/**
	 * Removes target element if found in the tree, otherwise, returns false.
	 * @param target the target element to delete.
	 * @return returns true if the element is deleted, otherwise false.
	 */
	public boolean remove(E target);
}
