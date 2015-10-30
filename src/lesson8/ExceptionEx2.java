package lesson8;

import java.util.Arrays;

public class ExceptionEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//count(1);
		count2();
	}
	public static void count(int n) {
		System.out.println(n);
		n += 1;
		count(n);
	}

	public static void count2() {
		
		for (int i = 44709200; i < Integer.MAX_VALUE; i++) {
			try {
				int[] arr = new int [i];
			} catch (Error e) {
				System.out.println(i + "*");
				return;
			}
			
			System.out.println(i);
		}
	}
		
}

