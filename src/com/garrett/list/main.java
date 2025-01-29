package com.garrett.list;

import com.garrett.search.Search;

public class main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(7);
		list.add(9);
		list.display();
		System.out.println("List size: " + list.size());
		list.addFirst(11);
		list.display();
		System.out.println("List size: " + list.size());
	}
	
	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;								// pointer at beginning
		int right = charArray.length - 1;			// pointer at end
		
		while (left < right) {
			// swap the left character with the right one
			char tmp = charArray[left];
			charArray[left] = charArray[right];
			
			// move the pointers towards each other
			left++;
			right--;
		}
		
		return new String(charArray);
	}

}
