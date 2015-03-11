package sorting.bubblesort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * This class tests functionality of static methods in a 
 * BubbleSorter class.
 * This class doesn't test for border cases.
 * 
 * @author Ivanovs Vladimirs
 *
 */
public class BubbleSorterTest {
	int[] arrTested;	//array to be used as an argument for method calls
	int[] arrExpected;	//expected result
	
	@Before
	public void initialize(){
		arrTested = new int[]{9,8,7,6,5,4,3,2,1,0};
		arrExpected = new int[]{0,1,2,3,4,5,6,7,8,9};
	}

	@Test
	public void testSortBubbleOne() {
		BubbleSorter.sortBubbleOne(arrTested);
		assertArrayEquals(arrExpected, arrTested);
	}
	
	@Test
	public void testSortBubbleTwo() {
		BubbleSorter.sortBubbleTwo(arrTested);
		assertArrayEquals(arrExpected, arrTested);
	}

}
