package sort;

import java.util.Arrays;



public class CountSort {
	public static void main (String[] args){
		ArraySize array = new ArraySize ();
		
		int[] arr = array.array();
	/*public static void count(int[] arr) {*/
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (max < arr[i]) 
				max = arr[i];
		}
		
       int[] c = new int[max];
       for (int i = 0; i < arr.length; i++) {
    	   
    	   int index = arr[i];
    	   c[index] = c[index] + 1;
       }
       System.out.println(Arrays.toString(c));
        
	}

}
