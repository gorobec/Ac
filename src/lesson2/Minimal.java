package lesson2;

import java.util.Scanner;

public class Minimal {

	public static int min(int a, int b){
		int min = 0;
		min =a < b? a:b;
		return min;
	}
	public static int min(int a, int b, int c, int d){
		int min1 = min (a, b);
		int min2 = min (c, d);
		return min(min1, min2);
	}
	public static int min(int a, int b, int c, int d, int e, int f, int g, int h){
		int min3 = min (a, b, c, d);
		int min4 = min (e, f, g, h);
		return min(min3, min4);
	}
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ����� :");
		int a = sc.nextInt();
		System.out.println("������� ������ ����� :");
		int b = sc.nextInt();
		System.out.println("������� ������ ����� :");
		int c = sc.nextInt();
		System.out.println("������� ��������� ����� :");
		int d = sc.nextInt();
		System.out.println("������� ����� ����� :");
		int e = sc.nextInt();
		System.out.println("������� ������ ����� :");
		int f = sc.nextInt();
		System.out.println("������� ������� ����� :");
		int g = sc.nextInt();
		System.out.println("������� ������� ����� :");
		int h = sc.nextInt();
		System.out.println("���������� �� ��� ����� - " + min(a, b, c, d, e, f, g, h));
	}
}