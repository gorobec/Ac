package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringS {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		//enter text
		System.out.print("Enter text, please: ");
		String s1 = reader.readLine();
		
		char[] chars = s1.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if (chars[i]== ' ')
				System.out.print(("" + chars[i + 1]).toUpperCase());
						
			
		}
		
		
	}
}


