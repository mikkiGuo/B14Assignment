package third_hw;

import java.util.Arrays;

public class MoveZerosToRight {

	/**
	 * move zeros to the right
	 * @param int[] arr
	 */
	public void moveZerosToRight(int[] arr) {
		int filled = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > 0) {
				arr[filled] = arr[i];
				arr[i] = 0;
				filled++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		MoveZerosToRight obj = new MoveZerosToRight();
		int[] test = {0,2,0,1,0,2,1,2,1,0};
		obj.moveZerosToRight(test);

	}

}
