package Lesson1;

public class MainAnimals{
	public static void main (String[] args){
		Dog dog = new Dog(); //��������� ������ ������� ����������� � ������ dog
		dog.age = 5;
		dog.name = "�����";
		dog.type = "���������";
		dog.gav();
		Parrot par = new Parrot();
		par.age = 8;
		par.name = "����";
		par.type = "������";
		par.colour = "��������";
		par.kar();
		Cat cat = new Cat();
		cat.age = 7;
		cat.name = "������";
		cat.type = "�������";
		cat.mjay();
		Snake snake = new Snake();
		snake.age = 12;
		snake.name = "�������";
		snake.howLong = 5;
		snake.sss();
	}	
		
}

