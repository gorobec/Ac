package lesson12a;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object o1 = new A();
		Object o2 = new B();
		Object o3 = new C();
		
		if (o2 instanceof A) {
			System.out.println("A");
		} else if (o2 instanceof B) {
			System.out.println("B");
		} else if (o2 instanceof C) {
			System.out.println("C");
		}
	}
	

}
