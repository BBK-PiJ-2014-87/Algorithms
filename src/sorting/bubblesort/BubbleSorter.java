package sorting.bubblesort;

import java.util.Arrays;
/**
 * This class provides static methods for sorting arrays with a 
 * Bubble Sort algorithms.
 * 
 * @author Workstation
 *
 */
public class BubbleSorter {
	public static void sortBubbleOne(int[] array){
		try{
			for (int end = array.length - 1; end >= 0; end--){
				for (int index = 0; index < end; index++){
					if (array[index] > array[index+1]){
						int temp = array[index];
						array[index] = array[index+1];
						array[index+1] = temp;
					}
				}
			}
		}catch(NullPointerException e){
			System.out.println("Array is empty!");
		}
		//to print the result of sorting function (optional)
		System.out.println(Arrays.toString(array));
	}
	
	public static void sortBubbleTwo(int[] array){
		try{
			for (int end = 0; end < array.length - 1; end++){
				for (int index = 0; index < array.length - end -1; index++){
					if (array[index] > array[index+1]){
						int temp = array[index];
						array[index] = array[index+1];
						array[index+1] = temp;
					}
				}
			}
		}catch(NullPointerException e){
			System.out.println("Array is empty!");
		}
		//to print the result of sorting function (optional)
		System.out.println(Arrays.toString(array));
	}

}
