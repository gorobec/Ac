package homeRecursion1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArrayRecursive {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("Enter the rows number: ");
		String sI = reader.readLine();
		int i = Integer.parseInt(sI);
		System.out.print("Enter the colums number: ");
		String sJ = reader.readLine();
		int j = Integer.parseInt (sJ);
		
		int [][]arr = new int[i][j];
		for (i = 0; i < arr.length; i++){
			 for(j = 0; j < arr[i].length; j++){
				 arr[i][j] = (int)(Math.random()*10); 
			 }
		}
				
		
		show(arr, 0);
	}
		
	
	public static void show (int [][]arr, int i) {
		
		if (i == arr.length) return;
		int j = 0;
		while (j < arr[i].length) {
			System.out.print(arr[i][j] + " ");
			j++;
		}	
		System.out.println();
		i++;
		show (arr, i);
		
		}
	}


