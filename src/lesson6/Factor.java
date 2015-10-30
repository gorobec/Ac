package lesson6;

public class Factor {

							
		
	static int f1 (int n) {
		if (n == 1) return 1;
		return n*f1(n - 1);
		 
		
	}
	
	static int f2 (int n) {
		int result = 1;
		for (int k = n; k >=1; k--) {
			result *= k;
		}
		return result;
	}

}
