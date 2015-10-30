package lesson4;

import java.util.Scanner;

public class mainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	test f = new test();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int first = sc.nextInt();
	System.out.print("Enter last number: ");
	int last = sc.nextInt();
	int res = f.numberInput(first,last);
	System.out.print("result - " + res);
	}

}
