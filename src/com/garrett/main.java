package com.garrett;

public class main {

	public static void main(String[] args) {
		String myName = "Joshua S. Garrett";
		System.out.println(main.reverseString(myName));
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
