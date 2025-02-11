package com.garrett.tree;

public class BinaryTree<E> {
	
	protected static class Node<E> {
		
		/** The information stored in the node */
		protected E data;
		/** Reference to the parent node */
		protected Node<E> parent;
		/** Reference to the left child */
		protected Node<E> leftChild;
		/** Reference to the right child */
		protected Node<E> rightChild;
		
		/**
		 * Construct a node with the given data and no children or parent.
		 * @param data The data to store in this node
		 */
		protected Node(E data) {
			this.data = data;
			parent = null;
			leftChild = null;
			rightChild = null;
		}
		
		/**
		 * Return a string representation of the node.
		 * @return a string representation of data
		 */
		@Override
		public String toString() {
			return data.toString();
		}
		
	}

}
