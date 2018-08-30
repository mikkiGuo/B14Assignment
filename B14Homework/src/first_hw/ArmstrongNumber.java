package first_hw;

public class ArmstrongNumber {

	public void getArmstrongNumber(int num) {
		int length = String.valueOf(num).length();
		int val = 0;
		int numCopy = num;
		for(int i=0;i<num;i++) {
			val += (int)Math.pow(numCopy%10, length);
			numCopy /= 10;
		}
		if(val == num) {
			System.out.println(num + " is an armstrong number");
		}else {
			System.out.println(num + " is not an armstrong number");
		}
		
	}
	
	public static void main(String[] args) {
		ArmstrongNumber obj = new ArmstrongNumber();
		obj.getArmstrongNumber(153);
	}

}
