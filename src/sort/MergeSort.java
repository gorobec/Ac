package sort;

import java.util.Arrays;

public class MergeSort {

	/*public static void main(String[] args) {
		
		ArraySize array = new ArraySize();
		
		int[] arr = array.array();
		
		System.out.println(Arrays.toString(sort (arr)));
	}*/
		
		public static int[] sort (int[] arr) {	//принимаем массив
						
			if (arr.length < 2)	//если его длина 1, значит он уже разделен полностью
				return arr;
			
			int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);	//первая половина массива
			int[] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);	//вторая половина массива
			
			return merge (sort (arr1), sort (arr2));	//склеиваем уже полностью разделенныйе части массива
		}
			
		public static int[] merge (int[] arr1, int[] arr2) {
			
			int[] arr = new int[arr1.length + arr2.length];	//длина нового массива = суме длины 2 субмассивов
			int i1= 0;
			int i2 = 0;
			
			for (int i = 0; i < arr.length; i++ ) {
				
				if (i1 == arr1.length) {	//если все элементы первого субмассива переданы, добавляем элементы второго субмасива без сортировки
					arr[i] = arr2[i2++];
				}
				else if (i2 == arr2.length) {//если все элементы второого субмассива переданы, добавляем элементы первого субмасива без сортировки
					arr[i] = arr1[i1++];
				}
				else {
					if (arr1[i1] < arr2[i2]) {	//сравниваем величины элементов субмассивов между собой
						arr[i] = arr1[i1++];
					}
					else {
						arr[i] = arr2[i2++];
					}
					
				}
			}			
			return  arr;
		}
}
