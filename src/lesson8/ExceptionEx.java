package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx {

	
	public static void main(String[] args) throws IOException  {
		
		int count = 0;
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("Enter numbers, please: ");
		while (true) {
		
		
		String s1 = "";
		
		
		try { s1 = reader.readLine();
		if (s1.equals("exit")) {
			break;
		}
		int iS = Integer.parseInt(s1);		
		count += iS;
		} catch (IOException e) {
			return;}
		catch (NumberFormatException e) {
			System.out.println("try again");
			}
		System.out.println(count);
		}
	}

}
