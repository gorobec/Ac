package lesson3;

import java.util.Scanner;

public class ElseIf3 {
	
	public static void main (String[] args){
		numberInput();
	}
	public static void numberInput(){
		if(TrueNottrue()){
			System.out.println("�� ����� ������ �����...");
		}
		else{
			System.out.println("�� ����� �������� �����...");
		}
		
	}
	public static boolean TrueNottrue(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� :");
		int number = sc.nextInt();
		return number%2 == 0;
		
	}
}

