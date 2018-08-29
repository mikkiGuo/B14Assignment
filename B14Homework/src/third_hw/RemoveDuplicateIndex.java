package third_hw;

import java.util.Arrays;

public class RemoveDuplicateIndex {

	/**
	 * remove duplicate
	 * @param int[] arr
	 */
	public void removeDuplicateIndex(int[] arr) {
		int compareValIndex = 0;
		int ct = 1;
		for(int i = 1; i<arr.length;i++) {
			if(arr[i] != arr[compareValIndex]) {
				arr[compareValIndex+1] = arr[i];
				compareValIndex++;
				ct++;
			}
		}
		int[] copy = Arrays.copyOf(arr, ct);
		System.out.println(Arrays.toString(copy));
	}
	
	public static void main(String[] args) {
		RemoveDuplicateIndex obj = new RemoveDuplicateIndex();
		int[] test2 = {1,1,2,2,3,3,3,4,5,6,6,7};
		obj.removeDuplicateIndex(test2);

	}

}
