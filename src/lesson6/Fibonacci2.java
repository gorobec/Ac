package lesson6;

public class Fibonacci2 {
	
	public static int fibo (int n) {
		System.out.print(n + " "); //обход вглубь
		if (n == 0) return 0;
		if (n == 1) return 1;
		return a() + fibo (n - 2) + fibo (n - 1) + b();
	}
	
	public static int a () {
		System.out.print("(");
		return 0;
	}
	public static int b () {
		System.out.print(")");
		return 0;
	}
}
