package sort;

import java.util.Arrays;

public class ChooseArray {

	
	public void choose(int[] arr) {
		
		
		
		for (int j = arr.length - 1; j >= 0; j--){	//сокращаем границу массива на 1, к правой части, за границей, будет макс. число
			int max = j;	//индкс максимального числа берем последнее число массива, которое будет изменяться каждый раз при сокращении массива
			for (int i = 0; i < j; i++) {	//ищем максимальное число масива
				if (arr[i] > arr[max])
					max = i;	//меняем индекс числа на максимальное чило
			}
			int tmp = arr[j]; //переставляем макс. число в конец массива
			arr[j] = arr[max];
			arr[max] = tmp;
		}
		
		System.out.println("\n***********ChooseArray************");
		System.out.println(Arrays.toString(arr));
	}

}
