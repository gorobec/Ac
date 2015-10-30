package Lesson1;

public class MainAnimals{
	public static void main (String[] args){
		Dog dog = new Dog(); //создается объект который присваивают к ссылке dog
		dog.age = 5;
		dog.name = "Шарик";
		dog.type = "Сербернар";
		dog.gav();
		Parrot par = new Parrot();
		par.age = 8;
		par.name = "Кеша";
		par.type = "какаду";
		par.colour = "зеленого";
		par.kar();
		Cat cat = new Cat();
		cat.age = 7;
		cat.name = "Мурчик";
		cat.type = "Ангорка";
		cat.mjay();
		Snake snake = new Snake();
		snake.age = 12;
		snake.name = "Горыныч";
		snake.howLong = 5;
		snake.sss();
	}	
		
}

