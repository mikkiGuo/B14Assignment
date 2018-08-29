package second_hw;

public class LinearSearch {

	/**
	 * Linear Search
	 * @param int[] arr, int key
	 * find value
	 */
	public void linearSearch(int[]arr, int target) {
		boolean isFound = false;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == target) {
				isFound = true;
				System.out.println(target + " in index number " + i);
				break;
			}
		}
		if(!isFound) {
			System.out.println("target not in array");
		}
		
	}
	
	public static void main(String[] args) {
		
		LinearSearch obj = new LinearSearch();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		obj.linearSearch(arr, 5);
		
	}

}
