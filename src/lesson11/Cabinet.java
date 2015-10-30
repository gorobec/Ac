package lesson11;

public class Cabinet {
	
	public static final int AMOUNT_OF_COMPS = 13;
	
	private Computer[] comps;
	
	public Computer[] getComps() {
		return comps;
	}
	
	public Cabinet() {
		
		comps = new Computer[AMOUNT_OF_COMPS];
		for (int i = 0; i < comps.length; i++) {
			comps[i] = new Computer (i + 1);
		}
	}
	
}
