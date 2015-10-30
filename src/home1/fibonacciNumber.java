package home1;

import java.util.Scanner;

public class fibonacciNumber {
	
	public static void main(String[] args){
		
		fibonacci();
		
	}
	
	public static void fibonacci(){
		
		Scanner sc = new Scanner(System.in);
		int enteredNumber = 0;
		
		while (enteredNumber < 1){
			System.out.println("Enter a positive integer greater than 1: ");
			enteredNumber = sc.nextInt();
		}
			
		int fibonacciPosition = 1;
		int f1 = 0;
		int f2 = 1;
		int fibonacciNumber = f1 + f2;
	
		
		while (fibonacciPosition < enteredNumber){
			fibonacciNumber = f1 + f2;
			f1 = f2;
			f2 = fibonacciNumber;
			fibonacciPosition++;
			
		}
		System.out.println("In the sequence of Fibonacci numbers under the number "+ enteredNumber + " is the number " + fibonacciNumber);
	}
}
