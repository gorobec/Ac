package lesson3;

import java.util.Scanner;

public class ElseIf3 {
	
	public static void main (String[] args){
		numberInput();
	}
	public static void numberInput(){
		if(TrueNottrue()){
			System.out.println("Вы ввели парное число...");
		}
		else{
			System.out.println("Вы ввели непарное число...");
		}
		
	}
	public static boolean TrueNottrue(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число :");
		int number = sc.nextInt();
		return number%2 == 0;
		
	}
}

