package lesson2;

import java.util.Scanner;

public class CalcMain{
	
public static void main (String[] args){
	Calc calc = new Calc();
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите первое число :");
	int a = sc.nextInt();
	System.out.println("Введите второе число :");
	int b = sc.nextInt();
	int add = calc.add(a, b);
	System.out.println("Их сумма будет равна: " + add);
	
	/* Можно вывести значения без присвоения переменной*/
	System.out.println("Их разница будет равна: " + calc.minus(a, b));
	System.out.println("Также можно поделить эти числа: " + calc.del(a, b));
	System.out.println("Либо умножыть: " + calc.ymnog(a, b));
	}
}

