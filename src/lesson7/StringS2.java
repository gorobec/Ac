package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringS2 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		//enter text
		System.out.print("Enter text, please: ");
		String s1 = reader.readLine();
		
		String[] s2 = s1.split(" ");	//split text inside array by " "
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			try {
				int number = Integer.parseInt(s2[i]); 	// equal string to int
				count += number;	//if it's number it'll count
			}
			catch (NumberFormatException e) {
			
		
			}
		
		}
		System.out.println(count); 
	}
	
}


