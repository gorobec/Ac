package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
	private int age;
	private String fio;
	public static final Date d = new Date();
	private int health = 100;




    public Human() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Enter player age: ");

            try {
                setAge(Integer.parseInt(bf.readLine()));

                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format...");
            }
        }
        while (getFio() == "" || getFio().length() == 0 || getFio() == null) {
            System.out.print("Enter player name: ");
            try {
                setFio(bf.readLine());
                break;
            } catch (NullPointerException e) { /// Как применить?
                System.out.println("Please, enter information");
            }
        }

	}
	
	public Human(int a, String f) {
		age = a;
		fio = f;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
	public void present (Human h) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy  HH:mm");
		System.out.println("Hello " + h.getFio() + ", you are " + (h.getAge() + 1) + " date: " + sdf.format(d));
	}
	public void hit(Human h2) {
		int power = (int)(Math.random()*20);
		
		h2.setHealth(h2.getHealth() - power);

		System.out.println(h2.fio + ", your health is " + h2.getHealth() + " after the " + fio + " " + power + "-points' hit");

	}
	
}
 
