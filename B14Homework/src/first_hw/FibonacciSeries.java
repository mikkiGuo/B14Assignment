package first_hw;

public class FibonacciSeries {

	/**
	 * Fibonacci Series
	 * @param maxLength
	 */
	public void getFibonacciSeries(int maxLength) {
		int i = 0;
		//initialize first two values in Fibonacci Series and print
		int first = 0;
		System.out.print(first + "\t");
		i++;
		int second = 1;
		System.out.print(second + "\t");
		i++;
		int third;
		while(i < maxLength){
			third = first + second;
			System.out.print(third + "\t");
			i++;
			first = second;
			second = third;	
		};		
		
	}
	
	public static void main(String[] args) {
		FibonacciSeries obj = new FibonacciSeries();
		obj.getFibonacciSeries(8);

	}

}
