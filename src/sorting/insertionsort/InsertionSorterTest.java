package sorting.insertionsort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InsertionSorterTest {
	private int[] testArray;		//to be sorted
	private int[] testArrayExp;		//expected output
	private int[] testArrayExp2;		//expected output
	
	@Before
	public void initialize(){
		testArray = new int[]{4,1,2,3,0};
		testArrayExp = new int[]{0,1,2,3,4};
		testArrayExp2 = new int[]{4,3,2,1,0};
	}

	@Test
	public void testSortInsertionOne() {
		InsertionSorter.sortInsertionOne(testArray);
		assertArrayEquals(testArrayExp,testArray);
	}
	
	@Test
	public void testSortInsertionTwo() {
		InsertionSorter.sortInsertionTwo(testArray);
		assertArrayEquals(testArrayExp,testArray);
	}
	
	@Test
	public void testSortInsertionThree() {
		InsertionSorter.sortInsertionThree(testArray);
		assertArrayEquals(testArrayExp2,testArray);
	}


}
