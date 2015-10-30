package lesson5;

import java.io.IOException;

public class MultiArrayTest {

	public static void main(String[] args) throws IOException {
		
		MultiArray arr = new MultiArray();
		System.out.println("1st multiarray.\n");
		int[][] arr1 = arr.multiArray();
		System.out.println("\n2nd multiarray.\n");
		int[][] arr2 = arr.multiArray();
		System.out.println("\nTheir summ is:");
		
		
		MultiArraySumm sum = new MultiArraySumm();
		sum.arraySumm (arr1, arr2);
		

	}

}
