package lesson3;

import java.util.Scanner;

public class ElseIf4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProstoeChislo();
	}
	public static void ProstoeChislo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� :");
		int number = sc.nextInt();
		
		if(number%2 != 0 & number%3 != 0 & number%5 != 0 & number%7 != 0){
			
				if(number/number == 1 & number/1 == number){
					System.out.println("�� ����� ������� �����.");
				}
				else{
					System.out.println("�� ����� ��������� �����.");
				}
		}		
		else{
			System.out.println("`�� ����� ��������� �����.");
			}
	}

}
