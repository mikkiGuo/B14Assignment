package second_hw;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBubble {

	
	int[] arr = {5,3,1,7,11,18};
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	}	
	
	@Test
	public void test1() {
		
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		String expected = "[1, 3, 5, 7, 11, 18]\n";
		assertEquals(expected, outContent.toString());
		
	}
	
	
	
	
	
}
