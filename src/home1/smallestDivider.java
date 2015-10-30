package home1;

import java.util.Scanner;

public class smallestDivider {

	public static void main(String[] args) {

		naturalNumber();
	}
	
	public static void naturalNumber(){
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 1){
			
			System.out.print("Enter positive integer (N): ");
			n = sc.nextInt();
		}
		int k = 1;
		
		while (2*k <= n){
		
			if (2*k >= n){
				break;
				
			}
			
			k++;				
		}
		System.out.println("The smallest integer k, if 2k> = N is equal to " + k);
		
		
	}	
		
}


