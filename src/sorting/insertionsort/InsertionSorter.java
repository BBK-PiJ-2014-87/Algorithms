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
	 * Sorts array MIN -> MAX way.
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
				// prints sorting steps (optional)
				System.out.println(Arrays.toString(array));
			}
			array[pos2 + 1] = tmpElement;
			// to separate console outputs (optional)
			System.out.println(Arrays.toString(array));
			System.out.println("exit inner loop");

		}
		// to separate console outputs (optional)
		System.out.println();
	}

	/**
	 * Sorts array MIN->MAX way.
	 * 
	 * @param array
	 *            to be sorted
	 */
	public static void sortInsertionTwo(int[] array) {
		for (int pos = 1; pos < array.length; pos++) {
			int tmpElement = array[pos];
			int position = pos - 1;
			while (position >= 0 && array[position] > tmpElement) {
				array[position + 1] = array[position];
				position--;
				// prints sorting steps (optional)
				System.out.println(Arrays.toString(array));
			}
			array[position + 1] = tmpElement;
			// to separate console outputs (optional)
			System.out.println(Arrays.toString(array));
			System.out.println("exit inner loop");

		}
		// to separate console outputs (optional)
		System.out.println();
	}

	/**
	 * Sorts array MAX<-MIN way.
	 * 
	 * @param array
	 *            to be sorted
	 */
	public static void sortInsertionThree(int[] array) {
		System.out.println(Arrays.toString(array));

		for (int pos = 1; pos < array.length; pos++) {
			int elementValue = array[pos];
			int pos2 = pos - 1;
			while (pos2 >= 0 && array[pos2] <= elementValue) {
				array[pos2 + 1] = array[pos2];
				pos2--;
				// to see array rearrangement (optional)
				System.out.println(Arrays.toString(array));
			}
			array[pos2 + 1] = elementValue;
		}

	}
}
