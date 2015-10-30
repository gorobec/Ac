package sort;

import java.util.Arrays;

public class BubbleSort {
	
	public void bubble (int[] arr) {
		
		
		for (int j = arr.length - 1; j > 0 ; j--) {
					
			for (int i = 0; i < j; i++) {
					
				if (arr[i] > arr[i + 1]) {
								
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
						}
				
			}
							
		}
		System.out.println("\n***********BubbleSort**********");
		System.out.println(Arrays.toString(arr));
	}
}
