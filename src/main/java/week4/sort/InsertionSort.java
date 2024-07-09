package week4.sort;

import java.util.Arrays;

public class InsertionSort {

	/*
	 *
	 * unsorted: to the right sorted: to the left

	 * We need to move one by one from the unsorted part
	 * to the sorted part. We need to insert the element into the right place in the sorted part.

	 * We start from index=1 because we assume the first element in the array is already sorted.

	 * We repeat the following logic using for-loop for each element in the unsorted part of the array.
	 * The Time-Complexity of Insertion Sort is quadratic -> 0(n^2).
	 * We divide the original array in two parts:
	 **
	 **/



	public static void insertionSort(int[] elements) {

		for (int j = 1; j < elements.length; j++) {

			int temp = elements[j];
			int possibleIndex = j;
			/*
			 * Since we dont know the insertion positon we use a while
			 */

			while (possibleIndex > 0 && temp < elements [possibleIndex - 1]) {
				elements [possibleIndex] = elements[possibleIndex -1];
				possibleIndex --;
			}
			elements [possibleIndex] = temp;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {4, 2, 8, 5, 3, 9};
		System.out.println(Arrays.toString(numbers));

		insertionSort(numbers);
		
		System.out.println(Arrays.toString(numbers));


	}

}
