package com.garrett.tree;

import java.util.Iterator;

public class BinaryTree<E> {
	
	/** The root of the binary tree */
	protected Node<E> root;
	
	/** Default constructor where tree is empty */
	public BinaryTree() {
		root = null;
	}
	
	/** Only used by methods internal to the BinaryTree class and its subclasses */
	protected BinaryTree(Node<E> root) {
		this.root = root;
	}
	
	/**
	 * Returns the left subtree of the binary tree.
	 * @return the left subtree of the tree, otherwise, it returns null.
	 */
	public BinaryTree<E> getLeftSubTree() {
		if (root != null && root.leftChild != null) {
			return new BinaryTree<>(root.leftChild);
		} else {
			return null;
		}
	}
	
	/**
	 * Determines whether this tree is a leaf.
	 * @return true if the root has no children.
	 */
	public boolean isLeaf() {
		if (root.leftChild == null && root.rightChild == null) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Non-recursive wrapper method that invokes the recursive, preorder,
	 * traversal and printing of the subtree.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		toString(root, 1, str);
		return str.toString();
	}
	
	/**
	 * Converts a subtree to a string by performing a preorder traversal.
	 * @param root the local root
	 * @param depth the depth of the subtree
	 * @param sb the StringBuilder to save the output
	 */
	public void toString(Node<E> root, int depth, StringBuilder sb) {
		// for every level of depth, indent by an additional space
		for (int i = 0 ; i < depth; i++) {
			sb.append(" ");
		}
		
		// if the tree is null, otherwise traverse left and right and append data
		if (root == null) {
			sb.append("null\n");
		} else {
			// append current root's data
			sb.append(root.data.toString());
			sb.append("\n");
			// traverse left
			toString(root.leftChild, depth + 1, sb);
			// traverse right
			toString(root.rightChild, depth + 1, sb); 
		}
	}
	
	/**
	 * Returns the right subtree of the binary tree.
	 * @return the right subtree of the tree, otherwise, it returns null.
	 */
	public BinaryTree<E> getRightSubtree() {
		if (root != null && root.rightChild != null) {
			return new BinaryTree<>(root.rightChild);
		} else {
			return null;
		}
	}
	
	public BinaryTree(BinaryTree<E> leftTree, BinaryTree<E> rightTree, E data) {
		root = new Node<>(data);
		// if left is not an empty tree, then make the leftTree the left child
		if (leftTree != null) {
			root.leftChild = leftTree.root;
		} else {
			root.leftChild = null;
		}
		if (rightTree != null) {
			root.rightChild = rightTree.root;
		} else {
			root.rightChild = null;
		}
		
	}
	
	
	
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
		 * Determines if the subtree of nodes is considered a full tree.
		 * @return true if every node in the tree has either zero or two children.
		 * @author Joshua S. Garrett
		 * @version Feb 2nd, 2025
		 */
		public boolean isFull() {
			// base - if node has zero childre
			if (leftChild == null && rightChild == null) {
				return true;
			}
			if (leftChild != null && rightChild != null) {
				return leftChild.isFull() && rightChild.isFull();
			}
			return false;
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
