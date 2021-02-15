package first_hw;

public class FactorialNumber {

	/**
	 * Factorial Number
	 * @param num
	 */
	public void getFactorialNumber(int num) {
		int val = 1;
		System.out.print(num+"! = ");
		for(int i=num; i>1; i--) {
			System.out.print(i + " * ");
			val *=num;
		}
		System.out.print(1);
		val *= num;
		System.out.println("\nwhich is equal to " + val);
	}
	
	public static void main(String[] args) {
		FactorialNumber obj = new FactorialNumber();
		obj.getFactorialNumber(3);

	}

}
