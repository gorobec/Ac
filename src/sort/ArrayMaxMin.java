package sort;

public class ArrayMaxMin {
	
	public int arrMax (int[] arr) {
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (max < arr[i]) 
				max = arr[i];
		}
		//System.out.println(max);
		return max;
	}
	public int arrMin (int[] arr) {
			
			int min = arr[0];
			
			for (int i = 1; i < arr.length; i++) {
				
				if (min > arr[i]) 
					min = arr[i];
			}
			//System.out.println(max);
			return min;
	}
}
