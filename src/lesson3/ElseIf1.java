package lesson3;

import java.util.Scanner;

public class ElseIf1 {

	public static void main (String[] args){
		numberInput();
	}
	public static void numberInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число :");
		int number = sc.nextInt();
		
		if(number%2 == 1){
			System.out.println("Вы ввели непарное число...");
		}
		else{
			System.out.println("Вы ввели парное число...");
		}
	}
}
