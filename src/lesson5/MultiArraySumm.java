package lesson5;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;*/

public class MultiArraySumm {
	
	public void arraySumm (int[][] arr1, int[][] arr2) {

	/*public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		//entered parameters
		System.out.print("Enter the strings number: ");
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
		int [][]arr2 = new int[i][j];
		for (i = 0; i < arr2.length; i++){
			 for(j = 0; j < arr2[i].length; j++){
				 arr2[i][j] = (int)(Math.random()*10);
			 }
		}
		//print
		for (i = 0; i < arr1.length; i++){
			 for(j = 0; j < arr1[i].length; j++){
				 System.out.print(arr1[i][j] + " ");
			 }
			 System.out.println();
		}
		System.out.println("\n++++++++++++++++\n");
		
		for (i = 0; i < arr2.length; i++){
			 for(j = 0; j < arr2[i].length; j++){
				 System.out.print(arr2[i][j] + " ");
			 }
			 System.out.println();
		}*/
		
		if (arr1.length != arr2.length) {
			System.out.println("NOT EQUAL! arrays size");
			throw new NullPointerException();
		}
		int i = arr1.length;
		int j = arr1[0].length;
		
		int [][] arrSumm = new int[i][j];
		System.out.println("\n======================\n");
		
		for (i = 0; i < arrSumm.length; i++){
			 for(j = 0; j < arrSumm[i].length; j++){
				 arrSumm[i][j] = arr1[i][j] + arr2[i][j];
			 }
		}
		for (i = 0; i < arrSumm.length; i++){
			 for(j = 0; j < arrSumm[i].length; j++){
				 System.out.print(arrSumm[i][j] + " ");
			 }
			 System.out.println();
		}
	
	}
}


