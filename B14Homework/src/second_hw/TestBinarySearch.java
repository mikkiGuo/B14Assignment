package second_hw;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinarySearch {

	int[] arr = {1,3,6,8,9,10,22};
	
	
	
	@Test
	public void test1() {
		
		BinarySearch bs = new BinarySearch();
		int actual = bs.binarySearch(arr, 1, 0, arr.length-1);
		int expected = 0;
		
		assertEquals(expected, actual);
				
	}
	
	@Test
	public void test2() {
		
		BinarySearch bs = new BinarySearch();
		int actual = bs.binarySearch(arr, 4, 0, arr.length-1);
		int expected = -1;
		
		assertEquals(expected, actual);
				
	}	
	
}
