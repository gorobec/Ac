package lesson6;

public class Fibonacci {
	
	public static int fibo (int n) {
		//System.out.print(n + " "); 	//обход вглубь
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fibo (n - 2) + fibo (n - 1);
		
		
	}

}
