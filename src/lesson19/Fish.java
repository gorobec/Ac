package lesson19;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Fish extends Animal{
	int depth;
	
	
	

	public Fish() {
		
	}
	public Fish(String name, int age, int depth) {
		super(name, age);
		this.depth = depth;
	}
	public void swim(){
		System.out.println("I can swim");
	}	
	public void dive() {
		System.out.println("I can dive");
	}
	
	public void info(){
		System.out.println("My name is " + name + "\nI'm " + age + " year's" + "\nI can dive in " + depth + " m");
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		name = (String)in.readObject();
		age = in.readInt();
		depth = in.readInt();
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeInt(age);
		out.writeInt(depth);
		out.flush();
	}
	
	
	
	
	
	

}
