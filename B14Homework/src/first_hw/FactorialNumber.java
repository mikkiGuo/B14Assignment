package first_hw;

public class FactorialNumber {

	/**
	 * Factorial Number
	 * @param num
	 */
	public void factorialNumber(int num) {
		int val = 1;
		//System.out.print(num+"! = ");
		for(int i=num; i>0; i--) {
			//System.out.print(i + " * ");
			val *=i;
		}
		System.out.print(val);
	}
	
	public static void main(String[] args) {
		FactorialNumber obj = new FactorialNumber();
		obj.factorialNumber(3);

	}

}
