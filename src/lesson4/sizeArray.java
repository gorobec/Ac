package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class sizeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array's size: ");
		int size = sc.nextInt();
		int []ar = new int[size];
		for (int i = 0; i < ar.length; i++){
			ar[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(ar));
		
		sc.close();
	}

}
