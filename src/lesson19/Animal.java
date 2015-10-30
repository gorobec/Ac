package lesson19;

import java.io.Externalizable;
import java.io.Serializable;

public abstract class Animal implements Serializable, Externalizable{
	String name;
	int age;
	
	
	public Animal() {
		
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("I like to sleep");
		
	}
	
	public void eat() {
		System.out.println("I eat meat");
		
	}
	public abstract void info();
	
}
