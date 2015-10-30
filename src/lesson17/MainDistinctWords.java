package lesson17;

import java.util.Scanner;

public class MainDistinctWords {
	public static final int SIZE = 4;
	public static void main(String[] args) {
		print();
	}

	private static void print() {
		Scanner sc = new Scanner(System.in);
		String[] lines = new String[SIZE];
		for (int i = 0; i < lines.length; i++) {
			System.out.print("enter " + (i + 1) + " string: ");
			lines[i] = sc.nextLine();
		}
		
		DistinctWord printer = new DistinctWord(lines);
		printer.print();
	}
}
