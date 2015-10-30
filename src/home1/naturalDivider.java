package home1;

import java.util.Scanner;

public class naturalDivider {

	public static void main(String[] args) {

		divider();
	}
	
	public static void divider(){
		
		Scanner sc = new Scanner(System.in);
		
		int g = 0;
		
		while (g < 2){
			
			System.out.println("Enter a positive integer greater than  \"2\": ");
			g = sc.nextInt();
		}
		
		int divider = 2;
		
		while (divider <= g){
			
			if (g % divider == 0){
				break;
			}
            divider++;
		}	
		System.out.println("The smallest positive divisor of " + g + " than 1, is the number - " + divider);
	}

}
