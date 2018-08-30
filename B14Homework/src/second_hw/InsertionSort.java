package second_hw;

import java.util.Arrays;

public class InsertionSort {

	/**
	 * Insertion sort
	 * @param arr
	 * insert element into sorted sequence 
	 * and move all larger sorted elements one position to the right
	 */
	public void insertionSort(int[] arr) {
		
		for(int i = 1; i<arr.length; i++) {
			int value = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>value) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = value;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		int[] arr = {5,2,6,8,9,3,1,7,4};
		obj.insertionSort(arr);
	}

}
