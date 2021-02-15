package second_hw;

import java.util.Arrays;

public class SelectionSort {

	/**
	 * selection sort
	 * @param arr
	 * find smallest then put in the first
	 */	
	public void selectionSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++ ) {
			int sIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[sIndex]) {
					sIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[sIndex];
			arr[sIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {

		SelectionSort obj = new SelectionSort();
		int[] arr = {5,2,6,8,9,3,1,7,4};
		obj.selectionSort(arr);
	}

}
