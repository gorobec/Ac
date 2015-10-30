package lesson8;

public class ExceptionEx3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
	public static void m1() {
		m2();
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
		m4();
	}
	public static void m4() {
		m5();
	}
	public static void m5() {
		m6();
	}
	public static void m6() {
		throw new ArithmeticException();
		/*try {
			int a = 5/0;
		} catch (RuntimeException e) {
			System.out.println("Недопустимое действие");
			}*/
	}
}
