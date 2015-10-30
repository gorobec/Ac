package home1;

import java.util.Scanner;

public class yesNo {

	public static void main(String[] args) {
		
		System.out.println("\t\t\tIs the number of exact power of two.\n\n\n");
		 number();

	}
	
	public static void number(){
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int x = 2;
		
		while (n < 1){
			System.out.print("Enter positive integer (N): ");
			n = sc.nextInt();
		}
		
		for(x = 2; x < n; x *= 2){
			
		}
		
		if (x == n){
			
			System.out.println("YES");
		}
		else{
			
			System.out.println("NO");
		}
	}
}
