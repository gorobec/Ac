package lesson15;

public class MainClone {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Child child1 = new Child("Bogdan Petrovich");
		Child child2 = new Child("Andrej Vladimirovich");
		Wife olgaWife = new Wife("Olga Petrovna", child1);
		Wife iraWife = new Wife("Irina Pavlovna", child2);
		Husband husband1 = new Husband("Victor Petrovich", 34, olgaWife);
		
		Husband clonHusband = (Husband) husband1.clone();
		System.out.println(clonHusband);
		
		husband1.setWife(iraWife);
		
		System.out.println("\nafter:\n" + husband1);
		System.out.println(clonHusband);
		

	}

}
