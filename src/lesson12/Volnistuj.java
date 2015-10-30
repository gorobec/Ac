package lesson12;

public class Volnistuj extends Parrot {
	
	protected String size;
	public Volnistuj(boolean ex, boolean dna, String kl, String col, String size) {
		super(ex, dna, kl, col);
		this.size = size;
	}
	@Override
	public void eatEverything() {
		System.out.println("I'm beautiful " + klichka);
	}
}
