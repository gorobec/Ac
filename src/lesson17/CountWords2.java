package lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWords2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String s1 = br.readLine();		
		String[] array1 = s1.split(" ");
		
		String s2 = br.readLine();		
		String[] array2 = s1.split(" ");
		
		String s3 = br.readLine();		
		String[] array3 = s1.split(" ");
		
		String s4 = br.readLine();		
		String[] array4 = s1.split(" ");
		
		String s5[] = new String[array2.length + array3.length + array4.length];
		
		

	}

}
