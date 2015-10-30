package homeRecursion1;

public class Fibonacci3 {

	public static void main(String[] args) {
		
		fibo (5);
	}
	public static int fibo (int n) {
		
	/*if (n == 0) {
			System.out.print(n);
			return 0;
		}
		if (n == 1) {
			System.out.print(n);
			return 1;
		}
		return a() + fibo (n - 2) + c() + fibo (n - 1) + b();*/
		
		
		if (n < 2)
			System.out.print(n);
		return  (n < 2) ? n : a() + fibo (n - 2) + c() + fibo (n - 1) + b();
		
		
	}
	
	public static int a () {
		System.out.print("(");
		return 0;
	}
	public static int b () {
		System.out.print(")");
		return 0;
	}
	public static int c () {
		System.out.print("+");
		return 0;
	}
}
