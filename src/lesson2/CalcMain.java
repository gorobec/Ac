package lesson2;

import java.util.Scanner;

public class CalcMain{
	
public static void main (String[] args){
	Calc calc = new Calc();
	Scanner sc = new Scanner(System.in);
	System.out.println("������� ������ ����� :");
	int a = sc.nextInt();
	System.out.println("������� ������ ����� :");
	int b = sc.nextInt();
	int add = calc.add(a, b);
	System.out.println("�� ����� ����� �����: " + add);
	
	/* ����� ������� �������� ��� ���������� ����������*/
	System.out.println("�� ������� ����� �����: " + calc.minus(a, b));
	System.out.println("����� ����� �������� ��� �����: " + calc.del(a, b));
	System.out.println("���� ��������: " + calc.ymnog(a, b));
	}
}

