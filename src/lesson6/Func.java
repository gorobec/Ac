package lesson6;

public class Func {
	public static void f1 (int n) {
		System.out.print(n);
		if (n==0) return;
		f1(n - 1);
		System.out.print(n);
		
	}
	public static void f2 (int n) {
		if (n==0) return;
		f2(n - 1);
	System.out.print(n);
	
	}

}
