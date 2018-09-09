package second_hw;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestSelection {
	
	int[] arr = {5,3,1,7,11,18};

	
	@Test
	public void test1() {
		
		SelectionSort ss = new SelectionSort();
		int[] actual = ss.selectionSort(arr);
		int[] expected = {1,3,5,7,11,18};
		assertArrayEquals(expected, actual);
		
	}
	
}
