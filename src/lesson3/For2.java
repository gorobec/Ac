package lesson3;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
	
		ProstoeChislo();
	}
	
	public static void ProstoeChislo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите четырехкратное число: ");
		int number = sc.nextInt();
		int start = number;
		int summ = 0;
		for(int i = 0; i < 4; i++){
			int oneNumber = number % 10;
			int oneNumberPow = (int)Math.pow(oneNumber, 4);
			summ += oneNumberPow;
			number = number / 10;
		}
		if(summ == start){
			System.out.println("Это число Армнстронга!!!");
		}
		else{
			System.out.println("Это НЕ число Армнстронга!!!");
		}
	}
}
		
