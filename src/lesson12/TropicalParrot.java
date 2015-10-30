package lesson12;

public class TropicalParrot extends Parrot {
	protected boolean dangerous;
	
	public TropicalParrot(boolean ex, boolean dna, String kl, String col, boolean dang) {
		super(ex, dna, kl, col);
		dangerous = dang;
	}
	@Override
	public void eatEverything() {
		System.out.println("I'm dangereous " + klichka + " and I can eat even people");
	}
}
