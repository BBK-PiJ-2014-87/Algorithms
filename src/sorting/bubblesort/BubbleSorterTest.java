package sorting.bubblesort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This class tests functionality of static methods in a BubbleSorter class.
 * This class provides test for multiple cases.
 * 
 * @author Ivanovs Vladimirs
 *
 */
public class BubbleSorterTest {
	private int[] arrTested; // array to be used as a method argument
	private int[] arrExpected; // expected result
	private int[] arrTested2; // array to be used as a method argument
	private int[] arrExpected2; // expected result
	private int[] arrTested3; // array to be used as a method argument
	private int[] arrExpected3; // expected result
	private int[] arrTested4; // array to be used as a method argument
	private int[] arrExpected4; // expected result
	

	@Before
	public void initialize() {
		// functional test in normal case
		arrTested = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		arrExpected = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// test 1 element array
		arrTested2 = new int[] { 10 };
		arrExpected2 = new int[] { 10 };

		// test with a negative numbers
		arrTested3 = new int[] { -1, 1, -2, 2, -3, 3 };
		arrExpected3 = new int[] { -3, -2, -1, 1, 2, 3 };

		// empty array test
		arrTested4 = new int[] {};
		arrExpected4 = new int[] {};
	}

	@Test
	public void testSortBubbleOne() {
		BubbleSorter.sortBubbleOne(arrTested);
		assertArrayEquals(arrExpected, arrTested);
	}

	@Test
	public void testSortBubbleOne2() {
		BubbleSorter.sortBubbleOne(arrTested2);
		assertArrayEquals(arrExpected2, arrTested2);
	}

	@Test
	public void testSortBubbleOne3() {
		BubbleSorter.sortBubbleOne(arrTested3);
		assertArrayEquals(arrExpected3, arrTested3);
	}

	@Test
	public void testSortBubbleOne4() {
		BubbleSorter.sortBubbleOne(arrTested4);
		assertArrayEquals(arrExpected4, arrTested4);
	}

	@Test
	public void testSortBubbleTwo() {
		BubbleSorter.sortBubbleTwo(arrTested);
		assertArrayEquals(arrExpected, arrTested);
	}

	@Test
	public void testSortBubbleTwo2() {
		BubbleSorter.sortBubbleTwo(arrTested2);
		assertArrayEquals(arrExpected2, arrTested2);
	}

	@Test
	public void testSortBubbleTwo3() {
		BubbleSorter.sortBubbleTwo(arrTested3);
		assertArrayEquals(arrExpected3, arrTested3);
	}

	@Test
	public void testSortBubbleTwo4() {
		BubbleSorter.sortBubbleTwo(arrTested4);
		assertArrayEquals(arrExpected4, arrTested4);
	}

	@Test
	public void testSortBubbleThree() {
		BubbleSorter.sortBubbleThree(arrTested);
		assertArrayEquals(arrExpected, arrTested);
	}

	@Test
	public void testSortBubbleThree2() {
		BubbleSorter.sortBubbleThree(arrTested2);
		assertArrayEquals(arrExpected2, arrTested2);
	}

	@Test
	public void testSortBubbleThree3() {
		BubbleSorter.sortBubbleThree(arrTested3);
		assertArrayEquals(arrExpected3, arrTested3);
	}

	@Test
	public void testSortBubbleThree4() {
		BubbleSorter.sortBubbleThree(arrTested4);
		assertArrayEquals(arrExpected4, arrTested4);
	}

}
