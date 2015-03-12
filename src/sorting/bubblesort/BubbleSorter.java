package sorting.bubblesort;

import java.util.Arrays;
/**
 * This class provides static methods for sorting arrays with a
 * various options of Bubble Sort algorithms.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class BubbleSorter {
	/**
	 * Sorts the array starting from the first to the last element.
	 * @param array to be sorted
	 */
	public static void sortBubbleOne(int[] array){
		try{
			for (int end = array.length - 1; end >= 0; end--){
				for (int index = 0; index < end; index++){
					if (array[index] > array[index+1]){
						int temp = array[index];
						array[index] = array[index+1];
						array[index+1] = temp;
						//to see all elements swaps (optional)
						System.out.println(Arrays.toString(array));
					}
				}
			}
		}catch(NullPointerException e){
			System.out.println("Array is empty!");
		}
		//to print the result of sorting function (optional)
		System.out.println();
	}
	/**
	 * Sorts the array starting from the first element to the last.
	 * @param array to be sorted
	 */
	public static void sortBubbleTwo(int[] array){
		try{
			for (int end = 0; end < array.length - 1; end++){
				for (int index = 0; index < array.length - end -1; index++){
					if (array[index] > array[index+1]){
						int temp = array[index];
						array[index] = array[index+1];
						array[index+1] = temp;
						//to see all elements swaps (optional)
						System.out.println(Arrays.toString(array));
					}
				}
			}
		}catch(NullPointerException e){
			System.out.println("Array is empty!");
		}
		//to print the result of sorting function (optional)
		System.out.println();
		
	}
	/**
	 * Sorts the array starting from the last element to the first.
	 * 
	 * @param array to be sorted
	 */
	public static void sortBubbleThree(int[] array){
		try{
			for (int end = array.length - 1; end >= 0; end--){
				for (int index = array.length - 1; index >array.length -1 - end; index--){
					if (array[index] < array[index-1]){
						int temp = array[index];
						array[index] = array[index-1];
						array[index-1] = temp;
						//to see all elements swaps (optional)
						System.out.println(Arrays.toString(array));
					}
				}
			}
		}catch(NullPointerException e){
			System.out.println("Array is empty!");
		}
		//to print the result of sorting function (optional)
		System.out.println();
	}

}
