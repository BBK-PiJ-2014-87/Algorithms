package sorting.insertionsort;

import java.util.Arrays;

/**
 * This class provides static methods for sorting arrays using Insertion Sort
 * algorithm.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class InsertionSorter {

	/**
	 * Sorts array using while loop.
	 * 
	 * @param array
	 *            to be sorted
	 */
	public static void sortInsertionOne(int[] array) {
		for (int pos1 = 1; pos1 < array.length; pos1++) {
			int tmpElement = array[pos1];
			int pos2 = pos1 - 1;
			while (pos2 >= 0 && array[pos2] > tmpElement) {
				array[pos2 + 1] = array[pos2];
				pos2 = pos2 - 1;
			}
			array[pos2 + 1] = tmpElement;
			// prints sorting steps (optional)
			System.out.println(Arrays.toString(array));

		}
		// to separate console outputs (optional)
		System.out.println();
	}

	/**
	 * 
	 * @param array
	 */
	public static void sortInsertionTwo(int[] array) {
		for (int pos = 1; pos < array.length; pos++) {
			int tmpElement = array[pos];
			int position = pos - 1;
			while (position >= 0 && array[position] > tmpElement) {
				array[position + 1] = array[position];
				position--;
			}
			array[position + 1] = tmpElement;
			// prints sorting steps (optional)
			System.out.println(Arrays.toString(array));

		}
		// to separate console outputs (optional)
		System.out.println();
	}
}
