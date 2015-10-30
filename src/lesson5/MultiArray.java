package lesson5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MultiArray {

	public int[][] multiArray() throws IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		//entered parameters
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
		
		//print
		for (i = 0; i < arr.length; i++){
			 for(j = 0; j < arr[i].length; j++){
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		}
		
		return arr;
	}

}
