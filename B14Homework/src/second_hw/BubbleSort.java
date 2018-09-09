package second_hw;

import java.util.Arrays;

public class BubbleSort {

	/**
	 * bubbleSort
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		
		for(int i = 0; i <= arr.length-2;++i) {
			for(int j = i+1; j < arr.length;++j) {
				if(arr[j]<arr[i]) {		
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int[] arr =  {5,3,1,7,11,18};
		obj.bubbleSort(arr);
	}

}
