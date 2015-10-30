package lesson3;

import java.util.Scanner;

public class ElseIf2 {
	
	public static void main (String[] args){
		go();
	}
	
	public static void go() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число:");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			number = (int) (Math.pow(number, 2));
		}

		else if (number % 3 == 0) {
			number = (int) (Math.pow(number, 9));
		}

		else if (number % 5 == 0 & number % 3 != 0) {
			number = (int) (Math.pow(number, 5));
		}

		else if (number % 5 == 0 & number % 3 == 0) {
			number = (int) (Math.pow(number, 15));
		}

		System.out.println("„исло = " + number);	
	}
}
