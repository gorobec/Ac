package lesson11;

public class Test {

	public static final int AMOUNT_OF_STUDENTS = 8;
	public static void main(String[] args) {

		Student[] students = new Student[AMOUNT_OF_STUDENTS];
		String[] names = {"Vitalij", "Misha", "Misha", "Yevhenij", "Pavel", "Jana", "Artur", "Masha"};
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(names[i]);
		}
		
		Cabinet cab = new Cabinet();
		for (Student s : students) {
			s.setDestination(cab);
		}
		for (int i = 0; i < students.length; i++) {
			students[i].setComputer(cab.getComps()[i]);
			students[i].work();
		}
		
		
		for (Student s : students) {
			s.finish();
		}
		
	}

}