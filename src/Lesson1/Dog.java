package Lesson1;

public class Dog {
	//поля
	int age;
	String name;
	String type;// порода

	
	public void  gav(){/*список входных параметров*/
		System.out.println("Меня зовут " + name);
		System.out.println("Мне " + age + " лет");
		System.out.println("Моя порода - " + type);
	}

}
