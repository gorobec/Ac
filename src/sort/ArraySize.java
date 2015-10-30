package sort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySize {

	public int[] array () {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array's size: ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++){
			
		arr[i] = (int)(Math.random() * 100);
		}
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();
		
		
		return arr;
		
		
	}
					
}
