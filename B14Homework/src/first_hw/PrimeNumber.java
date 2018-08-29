package first_hw;

import java.util.Vector;

public class PrimeNumber {

	/**
	 * Prime Number
	 * @param maxLength
	 */
	public void primeNumber(int maxLength) {
		
		if(maxLength == 0) {System.out.println("nothing to display because length is 0");}
		else {
			Vector<Integer> v = new Vector<Integer>();
			v.add(2);
			//initialize smallest prime number
			int num= 2;
			int i = 1;
			System.out.print(num + "\t");
			
			while(i < maxLength) {
				num++;
				boolean isPrime = true;
				for(int j = 2; j<=Math.sqrt(num);j++) {
					if((num%j) == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime == true) {
					System.out.print(num + "\t");
					i++;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		PrimeNumber obj = new PrimeNumber();
		obj.primeNumber(10);
	}

}
