package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		ArraySize array = new ArraySize();
		
		int[] arr = array.array();
		int start = 0;
		int end = arr.length - 1;
		
		quick (arr, start, end);
		System.out.println(Arrays.toString(arr));
	}
		
		public static void quick (int[] arr, int start, int end) {
			
			int pivot = pivot (arr, start, end);
				if (start < pivot -1)
					quick (arr,start, pivot -1);
				if (pivot < end)
					quick (arr, pivot, end);
		}
		
		public static int pivot (int[] arr, int start, int end) {
			
			int pivot = arr[(start + end) / 2];	//точка опоры
			
			int i = start;
			int j = end;
			
			while (i <= j) {
				
				while (arr[i] <= pivot) {
					i++;
				}
				while (arr[j] >= pivot) {
					j--;
				}
				
				if (i <= j) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
					
				}
			}
			return i;
			
		}
}
