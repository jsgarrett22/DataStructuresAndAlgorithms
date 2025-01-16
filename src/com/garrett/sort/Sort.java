package com.garrett.sort;

/**
 * Utility class that contains different sorting algorithms implementations
 * that may be used on collections of different types.
 */
public class Sort {
	
	/**
	 * Default implementation of the bubble sort algorithm, that will sort an array of ints in ascending order.
	 * @param array the array to be sorted.
	 * @return the sorted array in ascending order.
	 */
	public static int[] BubbleSort(int[] array) {
		int[] arrayToSort = array;
		int size = arrayToSort.length;
		
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arrayToSort[j] > arrayToSort[j + 1]) {
					int temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j + 1];
					arrayToSort[j + 1] = temp;
				}
			}
		}
		
		return arrayToSort;
	}
	
	/**
	 * Sorts an array of ints using the bubble sort algorithm, either in ascending or descending order.
	 * @param array the array to be sorted.
	 * @param x 0 = ascending, otherwise any other value results in descending order.
	 * @return the sorted array based on the value of x passed in.
	 */
	public static int[] BubbleSort(int[] array, int x) {
		int[] arrayToSort = array;
		int size = arrayToSort.length;
		
		// If x is 0, then sort in ascending order, else sort descending
		if (x == 0) {
			for (int i = 0; i < size - 1; i++) {
				for (int j = 0; j < size - i - 1; j++) {
					if (arrayToSort[j] > arrayToSort[j + 1]) {
						int temp = arrayToSort[j];
						arrayToSort[j] = arrayToSort[j + 1];
						arrayToSort[j + 1] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < size - 1; i++) {
				for (int j = 0; j < size - i - 1; j++) {
					if (arrayToSort[j] < arrayToSort[j + 1]) {
						int temp = arrayToSort[j];
						arrayToSort[j] = arrayToSort[j + 1];
						arrayToSort[j + 1] = temp;
					}
				}
			}
		}
		
		return arrayToSort;
	}
	
	/**
	 * Sorts an array of ints using the selection sort algorithm in ascending order.
	 * @param array the array to be sorted.
	 * @return the sorted array.
	 */
	public static int[] SelectionSort(int[] array) {
		int numOfPasses = 0;
		int numOfComparisons = 0;
		int numOfExchanges = 0;
		int[] arrayToSort = array;
		int size = arrayToSort.length;
		int temp = 0;
		int minIndex = -1;
		
		for (int i = 0; i < size - 1; i++) {
			minIndex = i;
			// find the minimum value each iteration
			for (int j = i + 1; j < size; j++) {
				// if i > i + 1
				if (arrayToSort[minIndex] > arrayToSort[j]) {
					minIndex = j;
					numOfComparisons++;
				}
			}
			// swap that minimum value with i before incrementing i by 1, in ascending order
			// from smallest to greatest
			temp = arrayToSort[minIndex];
			arrayToSort[minIndex] = arrayToSort[i];
			arrayToSort[i] = temp;
			numOfExchanges++;
			
			// PRINT TO CONSOLE
			System.out.print("[" + i + "]: ");
			printArray(arrayToSort);
			numOfPasses++;
		}
		// PRINT STATS TO CONSOLE
		System.out.println("Number of Passes: " + numOfPasses + "\n" + 
						"Number of Comparisons: " + numOfComparisons + "\n" +
						"Number of Exchanges: " + numOfExchanges + "\n");
		return array;
	}
	
	/**
	 * Sorts an array of ints using the selection sort algorithm in either ascending 
	 * or descending order based on a given parameter for x.
	 * @param array the array to be sorted.
	 * @param x (x = 0 -> ascending, otherwise, descending)
	 * @return the sorted array.
	 */
	public static int[] SelectionSort(int[] array, int x) {
		int[] arrayToSort = array;
		int size = arrayToSort.length;
		int temp = 0;
		int minIndex = -1;
		
		// ASCENDING
		if (x == 0) {
			for (int i = 0; i < size - 1; i++) {
				minIndex = i;
				// find the minimum value each iteration
				for (int j = i + 1; j < size; j++) {
					// if i > i + 1
					if (arrayToSort[minIndex] > arrayToSort[j]) {
						minIndex = j;
					}
				}
				// swap that minimum value with i before incrementing i by 1, in ascending order
				// from smallest to greatest
				temp = arrayToSort[minIndex];
				arrayToSort[minIndex] = arrayToSort[i];
				arrayToSort[i] = temp;
			}
		} else { // DESCENDING
			for (int i = 0; i < size - 1; i++) {
				minIndex = i;
				// find the maximum value each iteration
				for (int j = i + 1; j < size; j++) {
					// if i > i + 1
					if (arrayToSort[minIndex] < arrayToSort[j]) {
						minIndex = j;
					}
				}
				// swap that maximum value with i before incrementing i by 1, in descending order
				// from greatest to smallest
				temp = arrayToSort[minIndex];
				arrayToSort[minIndex] = arrayToSort[i];
				arrayToSort[i] = temp;
			}
		}
		
		return array;
	}
	
	/**
	 * Utility method to print an array to console.
	 * @param array the array to print to console
	 */
	private static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
