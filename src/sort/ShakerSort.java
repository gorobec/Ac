package sort;

import java.util.Arrays;

public class ShakerSort {

	public void shaker (int[] arr) {
		int left = 0;	//левая граница первоначального массива
		int right = arr.length;	//правая -**-
		
		for (int i = 0; i < arr.length/2; i++) {	//так как в цыкле 2 вложеных цыкла, то массив "уменьшиться в 2 раза" в конечном итоге
			
			
			for (int j = left; j < right - 1; j++) { // проганяем левый элемент в право, если он больше правостоящих
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
				
			}
			right--; 		//сокращаем правую границу массива
			
			for (int j = right; j > left; j--) {	//проганяем правый элемент в лево, если он меньше левостоящих
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
			left++; 	//сокращаем левую границу массива
		}
		System.out.println("\n***********ShakerSort**********");
		System.out.println(Arrays.toString(arr));
	}
}
