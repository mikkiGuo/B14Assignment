package second_hw;

public class BinarySearch {

	/**
	 * BinarySearch
	 * @param int[] arr, int target
	 */
	public int binarySearch(int[] arr, int target, int l, int r) {
		if(l < r) {
			int halfpoint = (l+r)/2;
			if(target == arr[halfpoint]) {
				System.out.println("target found in index " + halfpoint);
				return halfpoint;
			}
			if(target > arr[halfpoint]) {
				//search right side of array.
				return binarySearch(arr, target, halfpoint+1, r);
			}else {
				//search left side of array
				return binarySearch(arr, target, 0, halfpoint);
			}
		}else {
			if(arr[l] == target) {
				System.out.println("target found in index " + l);
				return l;
			}
			
			
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		obj.binarySearch(arr, 8, 0, arr.length-1);

	}

}
