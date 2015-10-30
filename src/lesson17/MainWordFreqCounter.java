package lesson17;

import java.util.Scanner;

public class MainWordFreqCounter {

	public static void main(String[] args) {
		print();
	}

	private static void print() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		WordFreqCounter counter = new WordFreqCounter(text);
		counter.print();
	}
}
