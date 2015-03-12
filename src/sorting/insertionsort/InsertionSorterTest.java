package sorting.insertionsort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InsertionSorterTest {
	private int[] testArray;		//to be sorted
	private int[] testArrayExp;		//expected output
	
	@Before
	public void initialize(){
		testArray = new int[]{9,1,8,2,7,3,6,4,5,5,0};
		testArrayExp = new int[]{0,1,2,3,4,5,5,6,7,8,9};
	}

	@Test
	public void testSortInsertionOne() {
		InsertionSorter.sortInsertionOne(testArray);
		assertArrayEquals(testArrayExp,testArray);
	}


}
