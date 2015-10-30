package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArrayMultiplication {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		//entered parameters
		System.out.println("Matrix multiplication\n");
		System.out.println("The number of columns of the left matrix is the same as the number of rows of the right matrix.\n");
		System.out.println("1st matrix.");
		System.out.print("Enter the rows number: ");
		String sI = reader.readLine();
		int i = Integer.parseInt(sI);
		
		System.out.print("Enter the colums number: ");
		String sJ = reader.readLine();
		int j = Integer.parseInt (sJ);
		
		
		int [][]arr1 = new int[i][j];
		for (i = 0; i < arr1.length; i++){
			 for(j = 0; j < arr1[i].length; j++){
				 arr1[i][j] = (int)(Math.random()*10);
			 }
		}
		System.out.println("\n2nd matrix");
		System.out.print("Enter the rows number: ");
		String sM = reader.readLine();
		int m = Integer.parseInt(sM);
		
		System.out.print("Enter the colums number: ");
		String sN = reader.readLine();
		int n = Integer.parseInt (sN);
		
		int [][]arr2 = new int[m][n];
		for (m = 0; m < arr2.length; m++){
			 for(n = 0; n < arr2[m].length; n++){
				 arr2[m][n] = (int)(Math.random()*10);
			 }
		}
		//print
		for (i = 0; i < arr1.length; i++){
			 for(j = 0; j < arr1[i].length; j++){
				 System.out.print(arr1[i][j] + " ");
			 }
			 System.out.println();
		}
		System.out.println("\n******************\n");
		
		for (m = 0; m < arr2.length; m++){
			 for(n = 0; n < arr2[m].length; n++){
				 System.out.print(arr2[m][n] + " ");
			 }
			 System.out.println();
		}System.out.println("\n");
		
		
		if (j != m) {
			System.out.println("NOT EQUAL! arrays size");
			throw new NullPointerException();
		}

		int[][] arr3 = new int[i][n];
		
		for (i = 0; i < arr3.length; i++) {
			for (n = 0; n < arr3[i].length; n++) {
				j = 0;
				m = 0;
				while (j < arr1[i].length && m < arr2.length) {
					
					arr3[i][n] += arr1[i][j] * arr2[m][n];
					j++;
					m++;
					
				}
				
				
			}
			
		}
		System.out.println("\nMultiplication of two matrices is");
		System.out.println("\n===================\n");
		
		for (i = 0; i < arr3.length; i++){
			 for(n = 0; n < arr3[i].length; n++){
				 System.out.print(arr3[i][n] + " ");
			 }
			 System.out.println();
		}
	}

}
