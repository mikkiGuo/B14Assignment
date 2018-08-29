package first_hw;

public class PalindromeNumber {

	/**
	 * Palindrome Number
	 * @param maxLength
	 */
	public void palindromeNumber(int maxLength) {
		int i = 0;	
		while(i<maxLength) {
			boolean isPalin = true;
			char[] num = String.valueOf(i).toCharArray();
			int len = num.length;
			for(int j = 0; j < len/2; j++) {
				if(num[j] != num[len - j - 1]) {
					isPalin = false;
					break;
				}
			}
			if(isPalin) {
				System.out.print(i + "\t");
			}	
			i++;
		}
	}
	
	public static void main(String[] args) {
		PalindromeNumber obj = new PalindromeNumber();
		obj.palindromeNumber(30);

	}

}
