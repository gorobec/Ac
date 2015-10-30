package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixInverse {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		//entered parameters
		System.out.println("Matrix inverse\n");
		System.out.print("Enter the rows\\colums number: ");
		String sI = reader.readLine();
		int i = Integer.parseInt(sI);
		
		
		int j = i;
		
		int [][]arr = new int[i][j];
		for (i = 0; i < arr.length; i++){
			 for(j = 0; j < arr[i].length; j++){
				 arr[i][j] = (int)(Math.random()*10);
			 }
		}
		for (i = 0; i < arr.length; i++){
			 for(j = 0; j < arr[i].length; j++){
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		}
		System.out.println("\n*****LET INVERSE IT*****\n");

		for (i = 0; i < arr.length; i++){
			 for(j = 0; j < arr.length - i; j++){
			 
				 int tmp = arr[i][j];
				 arr[i][j] = arr[arr.length - 1 - j][arr.length - 1 - i];
				 arr[arr.length - 1 - j][arr.length - 1 - i] = tmp;
			}
		}
		for (i = 0; i < arr.length; i++){
			 for(j = 0; j < arr.length; j++){
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		}
	}
}


