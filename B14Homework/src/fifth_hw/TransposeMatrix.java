package fifth_hw;

import java.util.Arrays;

public class TransposeMatrix {

	public void transposeMatrix(int[][] myArray) {
		for(int i = 0; i<myArray.length; i++) {
			for(int j = i; j < myArray[i].length; j++) {
				int temp = myArray[i][j];
				myArray[i][j] = myArray[j][i];
				myArray[j][i] = temp;
			}
		}
		for(int i = 0; i< myArray.length;i++) {
			for(int j = 0; j<myArray[i].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] myArray = new int[4][4];
		for (int i =0;i<4;i++) {
			for (int j = 0 ; j <4;j++) {
				myArray[i][j]=(i+1)*(j);
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(myArray.length);
		System.out.println(myArray[0].length);
		
		TransposeMatrix matrixT = new TransposeMatrix();
		matrixT.transposeMatrix(myArray);

	}

}
