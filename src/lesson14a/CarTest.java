package lesson14a;

public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car car1 = new Car(3, 5, null);
		Car car2 = new Car(3, 5, "BMW");
		
		System.out.println(car1.equals(car2));
		
		//Car car3 = new Car();
//		car2.clone();

	}

}
