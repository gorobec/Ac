package lesson4;

import java.util.Scanner;

public class enterSymbol {
	public String symbol(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter symbol: ");
	String symbol = sc.nextLine();
	return symbol;
	}
	
}

