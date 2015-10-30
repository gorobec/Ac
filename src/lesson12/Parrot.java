package lesson12;

public class Parrot extends Animal {
	
	public String colour;
	
	public Parrot(boolean ex, boolean dna, String kl, String col) {
		super(ex, dna, kl);
		colour = col;
	}
	public void eatEverything() {
		System.out.println("I'm eating everything");
	}
}
